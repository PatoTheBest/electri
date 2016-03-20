package net.prefixaut.deadalus;

import java.io.Serializable;

import net.prefixaut.deadalus.css.Style;
import net.prefixaut.deadalus.styles.Animatable;
import net.prefixaut.deadalus.styles.Animation;
import net.prefixaut.deadalus.styles.AnimationDirection;
import net.prefixaut.deadalus.util.CSS3.Units;

/**
 * A Class for Size-Calculations and definitions. This is used to define and to operate with various Sizes for Components.
 * 
 * @author PreFiXAUT
 */
public final class Size implements Style, Comparable<Size>, Animatable<Size>, Serializable {
	
	private static final long serialVersionUID = 0x1000200010000002L;
	private byte defID = 0;
	private boolean important = false;
	private double size = 0.0D;
	private SizeUnit unit = Units.PIXEL;
	public static final Size AUTO = new Size((byte) 1);
	public static final Size INHERIT = new Size((byte) 2);
	
	private Size(byte defID) {
		this.defID = defID;
	}
	
	public Size() {}
	
	public Size(double size) {
		this.size = size;
	}
	
	public Size(double size, SizeUnit unit) {
		this.size = size;
		this.unit = unit;
	}
	
	public Size(SizeUnit unit, double size) {
		this.size = size;
		this.unit = unit;
	}
	
	public void size(double size) {
		this.size = size;
	}
	
	public double size() {
		return this.size;
	}
	
	public void unit(SizeUnit unit) {
		this.unit = unit;
	}
	
	public SizeUnit unit() {
		return this.unit;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ( (unit == null) ? 0 : unit.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Size other = (Size) obj;
		if (defID != other.defID) return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size)) return false;
		if (unit == null) {
			if (other.unit != null) return false;
		} else if (!unit.equals(other.unit)) return false;
		return true;
	}
	
	@Override
	public String toString() {
		return unit.definition(size);
	}
	
	@Override
	public int compareTo(Size compare) {
		if (this.unit().convertToPixel(this.size()) > compare.unit().convertToPixel(compare.size())) return 1;
		if (this.unit().convertToPixel(this.size()) == compare.unit().convertToPixel(compare.size())) return 0;
		return -1;
	}
	
	public final double asPixel() {
		return this.unit().convertToPixel(this.size());
	}
	
	@Override
	public Runnable animate(Size to, Animation an) {
		return () -> {
			double max = an.duration() / an.fps();
			double difS = (this.unit().convertToPixel(this.size()) - to.unit().convertToPixel(to.size())) / max;
			for (int i = 0; i < an.iterations(); i++) {
				long buffer = 0;
				for (long frame = 0; frame < max; frame++) {
					long start = System.currentTimeMillis();
					long timeout = 1;
					AnimationDirection d = an.direction();
					if (d == AnimationDirection.INHERIT) {
						// TODO: Handle INHERIT!
						d = AnimationDirection.NORMAL;
					}
					// Handling Alternate-Directions
					if (d == AnimationDirection.ALTERNATE) {
						d = i % 2 == 0 ? AnimationDirection.REVERSE : AnimationDirection.NORMAL;
					} else if (d == AnimationDirection.ALTERNATE_REVERSE) {
						d = i % 2 != 0 ? AnimationDirection.REVERSE : AnimationDirection.NORMAL;
					}
					// Getting timeout
					if (d == AnimationDirection.NORMAL) {
						timeout = an.timing().timing(an.fps(), an.duration(), frame);
					} else {
						timeout = an.timing().timing(an.fps(), an.duration(), (long) max - frame);
					}
					this.size(this.size() + (this.unit().key() * difS));
					long end = System.currentTimeMillis();
					try {
						// Calculating buffer in case the frame took too long, so we reduce the next-frame duration the amount it was too much so they are even again.
						long tmp = (timeout - buffer) - (end - start);
						buffer = 0;
						if (tmp < 0) {
							buffer = tmp * -1;
							this.wait(0);
						} else this.wait(tmp);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				this.size(this.unit().key() * to.unit().convertToPixel(to.size()));
				try {
					this.wait(an.delay());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}
	
	@Override
	public String css() {
		return this.size() + this.unit().toString();
	}
	@Override
	public boolean important() {
		return this.important;
	}
	@Override
	public void important(boolean important) {
		this.important = important;
	}
}
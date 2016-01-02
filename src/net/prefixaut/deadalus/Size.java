package net.prefixaut.deadalus;

import java.io.Serializable;

import net.prefixaut.deadalus.styles.Animatable;
import net.prefixaut.deadalus.styles.Animation;
import net.prefixaut.deadalus.styles.AnimationDirection;
import net.prefixaut.deadalus.util.CSS3.Units;

/**
 * A Class for Size-Calculations and definitions. This is used to define and to operate with various Sizes for Components.
 * 
 * @author PreFiXAUT
 */
public final class Size implements Comparable<Size>, Animatable<Size>, Serializable {
	
	private static final long serialVersionUID = 0x1000200010000002L;
	private byte defID = 0;
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
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public void setUnit(SizeUnit unit) {
		this.unit = unit;
	}
	
	public SizeUnit getUnit() {
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
		return unit.getDefinition(size);
	}
	
	@Override
	public int compareTo(Size compare) {
		if (this.getUnit().convertToPixel(this.getSize()) > compare.getUnit().convertToPixel(compare.getSize())) return 1;
		if (this.getUnit().convertToPixel(this.getSize()) == compare.getUnit().convertToPixel(compare.getSize())) return 0;
		return -1;
	}
	
	public final double asPixel() {
		return this.getUnit().convertToPixel(this.getSize());
	}
	
	@Override
	public Runnable animate(Size to, Animation an) {
		return () -> {
			double max = an.getDuration() / an.getFPS();
			double difS = (this.getUnit().convertToPixel(this.getSize()) - to.getUnit().convertToPixel(to.getSize())) / max;
			for (int i = 0; i < an.getIteration(); i++) {
				long buffer = 0;
				for (long frame = 0; frame < max; frame++) {
					long start = System.currentTimeMillis();
					long timeout = 1;
					AnimationDirection d = an.getDirection();
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
						timeout = an.getTiming().getTiming(an.getFPS(), an.getDuration(), frame);
					} else {
						timeout = an.getTiming().getTiming(an.getFPS(), an.getDuration(), (long) max - frame);
					}
					this.setSize(this.getSize() + (this.getUnit().getKey() * difS));
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
				this.setSize(this.getUnit().getKey() * to.getUnit().convertToPixel(to.getSize()));
				try {
					this.wait(an.getDelay());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}
}
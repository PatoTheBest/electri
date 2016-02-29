package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.prelib.util.Limited;

public class Opacity implements Style, Animatable<Opacity>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000019L;
	private byte defID = 0;
	private Limited<Double> opacity = new Limited<>(0.0, 100.0);
	public static final Opacity INHERIT = new Opacity((byte) Byte.MAX_VALUE);
	
	private Opacity(byte defID) {
		this.defID = defID;
	}
	
	public Opacity(double opacity) {
		this.opacity.setValue(opacity);
	}
	
	public double opacity() {
		return opacity.getValue();
	}
	
	public void opacity(double opacity) {
		this.opacity.setValue(opacity);;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (opacity == null) ? 0 : opacity.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Opacity other = (Opacity) obj;
		if (defID != other.defID) return false;
		if (opacity == null) {
			if (other.opacity != null) return false;
		} else if (!opacity.equals(other.opacity)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(Opacity to, Animation an) {
		return () -> {
			double max = an.duration() / an.fps();
			double difO = (this.opacity() - to.opacity()) / max;
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
					this.opacity(this.opacity() + difO);
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
				this.opacity(to.opacity());
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
		return "" + this.opacity();
	}
}
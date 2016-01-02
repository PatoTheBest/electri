package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class Flex implements Style, Animatable<Flex>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000011L;
	private byte defID = 0;
	private int grow = 0, shrink = 0;
	private Size basis = Size.AUTO;
	public static final Flex AUTO = new Flex((byte) 1);
	public static final Flex INHERIT = new Flex((byte) Byte.MAX_VALUE);
	
	private Flex(byte defID) {
		this.defID = defID;
	}
	
	public Flex(int growNshrink) {
		this.grow = growNshrink;
		this.shrink = growNshrink;
	}
	
	public Flex(Size basis) {
		this.basis = basis;
	}
	
	public Flex(int growNshrink, Size basis) {
		this.grow = growNshrink;
		this.shrink = growNshrink;
		this.basis = basis;
	}
	
	public Flex(int grow, int shrink) {
		this.grow = grow;
		this.shrink = shrink;
	}
	
	public Flex(int grow, int shrink, Size basis) {
		this.grow = grow;
		this.shrink = shrink;
		this.basis = basis;
	}
	
	public int getGrow() {
		return grow;
	}
	
	public void setGrow(int grow) {
		this.grow = grow;
	}
	
	public int getShrink() {
		return shrink;
	}
	
	public void setShrink(int shrink) {
		this.shrink = shrink;
	}
	
	public Size getBasis() {
		return basis;
	}
	
	public void setBasis(double basis) {
		this.basis = new Size(basis);
	}
	
	public void setBasis(Size basis) {
		this.basis = basis;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (basis == null) ? 0 : basis.hashCode());
		result = prime * result + defID;
		result = prime * result + grow;
		result = prime * result + shrink;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flex other = (Flex) obj;
		if (basis == null) {
			if (other.basis != null)
				return false;
		} else if (!basis.equals(other.basis))
			return false;
		if (defID != other.defID)
			return false;
		if (grow != other.grow)
			return false;
		if (shrink != other.shrink)
			return false;
		return true;
	}
	
	@Override
	public Runnable animate(Flex to, Animation an) {
		return () -> {
			double max = an.getDuration() / an.getFPS();
			double difB = (this.getBasis().asPixel() - to.getBasis().asPixel()) / max,
					difS = (this.getShrink() - to.getShrink()) / max,
					difG = (this.getGrow() - to.getGrow()) / max;
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
					this.setBasis(this.getBasis().getUnit().getKey() * (this.getBasis().asPixel() + difB));
					this.setShrink((int) (this.getShrink() + difS)); 
					this.setGrow((int) (this.getGrow() + difG));
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
				this.setBasis(to.getBasis());
				this.setGrow(to.getGrow());
				this.setShrink(to.getShrink());
				try {
					this.wait(an.getDelay());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}
}
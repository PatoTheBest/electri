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
	
	public int grow() {
		return grow;
	}
	
	public void grow(int grow) {
		this.grow = grow;
	}
	
	public int shrink() {
		return shrink;
	}
	
	public void shrink(int shrink) {
		this.shrink = shrink;
	}
	
	public Size basis() {
		return basis;
	}
	
	public void basis(double basis) {
		this.basis = new Size(basis);
	}
	
	public void basis(Size basis) {
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
			double max = an.duration() / an.fps();
			double difB = (this.basis().asPixel() - to.basis().asPixel()) / max,
					difS = (this.shrink() - to.shrink()) / max,
					difG = (this.grow() - to.grow()) / max;
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
					this.basis(this.basis().unit().getKey() * (this.basis().asPixel() + difB));
					this.shrink((int) (this.shrink() + difS)); 
					this.grow((int) (this.grow() + difG));
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
				this.basis(to.basis());
				this.grow(to.grow());
				this.shrink(to.shrink());
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
		return this.grow() + " " + this.shrink() + " " + this.basis();
	}
}
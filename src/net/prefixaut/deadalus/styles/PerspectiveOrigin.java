package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class PerspectiveOrigin implements Style, Animatable<PerspectiveOrigin>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000001DL;
	private Size x = new Size(0), y = new Size(0);
	
	public PerspectiveOrigin(Size both) {
		this.x = both;
		this.y = both;
	}
	
	public PerspectiveOrigin(Size x, Size y) {
		this.x = x;
		this.y = y;
	}
	
	public Size getX() {
		return x;
	}
	
	public void setX(Size x) {
		this.x = x;
	}
	
	public Size getY() {
		return y;
	}
	
	public void setY(Size y) {
		this.y = y;
	}
	
	@Override
	public Runnable animate(PerspectiveOrigin to, Animation an) {
		return () -> {
			this.getX().animate(to.getX(), an).run();
			this.getY().animate(to.getY(), an).run();
		};
	}
}
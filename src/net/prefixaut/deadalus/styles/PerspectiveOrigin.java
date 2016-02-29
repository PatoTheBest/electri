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
	
	public Size x() {
		return x;
	}
	
	public void x(Size x) {
		this.x = x;
	}
	
	public Size y() {
		return y;
	}
	
	public void y(Size y) {
		this.y = y;
	}
	
	@Override
	public Runnable animate(PerspectiveOrigin to, Animation an) {
		return () -> {
			this.x().animate(to.x(), an).run();
			this.y().animate(to.y(), an).run();
		};
	}

	@Override
	public String css() {
		return this.x() + " " + this.y();
	}
}
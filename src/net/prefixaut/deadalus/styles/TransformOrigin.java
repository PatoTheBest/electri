package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class TransformOrigin implements Style, Animatable<TransformOrigin>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000024L;
	private Size x = new Size(0), y = new Size(0), z = new Size(0);
	
	public TransformOrigin(Size all) {
		this.x = all;
		this.y = all;
		this.z = all;
	}
	
	public TransformOrigin(Size x, Size y) {
		this.x = x;
		this.y = y;
	}
	
	public TransformOrigin(Size x, Size y, Size z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Size x() {
		return x;
	}
	
	public void x(Size x) {
		this.x = x;
	}
	
	public void x(double x) {
		this.x(new Size(x));
	}
	
	public Size y() {
		return y;
	}
	
	public void y(Size y) {
		this.y = y;
	}
	
	public void y(double y) {
		this.y(new Size(y));
	}
	
	public Size z() {
		return z;
	}
	
	public void z(Size z) {
		this.z = z;
	}
	
	public void z(double z) {
		this.z(new Size(z));
	}
	
	@Override
	public Runnable animate(TransformOrigin to, Animation an) {
		return () -> {
			this.x().animate(to.x(), an).run();
			this.y().animate(to.y(), an).run();
			this.z().animate(to.z(), an).run();
		};
	}

	@Override
	public String css() {
		return this.x() + " " + this.y() + " " + this.z();
	}
}
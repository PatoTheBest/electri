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
	
	public Size getZ() {
		return z;
	}
	
	public void setZ(Size z) {
		this.z = z;
	}
	
	@Override
	public Runnable animate(TransformOrigin to, Animation an) {
		return () -> {
			this.getX().animate(to.getX(), an).run();
			this.getY().animate(to.getY(), an).run();
			this.getZ().animate(to.getZ(), an).run();
		};
	}
}
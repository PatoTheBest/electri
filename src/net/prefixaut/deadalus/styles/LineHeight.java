package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class LineHeight implements Style, Animatable<LineHeight>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000017L;
	private byte defID = 0;
	private Size height = new Size(0);
	public static final LineHeight NORMAL = new LineHeight((byte) 1);
	public static final LineHeight INHERIT = new LineHeight((byte) Byte.MAX_VALUE);
	
	private LineHeight(byte defID) {
		this.defID = defID;
	}
	
	public LineHeight(double height) {
		this.height = new Size(height);
	}
	
	public LineHeight(Size height) {
		this.height = height;
	}
	
	public Size getHeight() {
		return height;
	}
	
	public void setHeight(Size height) {
		this.height = height;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (height == null) ? 0 : height.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		LineHeight other = (LineHeight) obj;
		if (defID != other.defID) return false;
		if (height == null) {
			if (other.height != null) return false;
		} else if (!height.equals(other.height)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(LineHeight to, Animation an) {
		return () -> {
			this.getHeight().animate(to.getHeight(), an).run();
		};
	}
}
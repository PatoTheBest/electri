package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class Columns implements Style, Animatable<Columns>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000000EL;
	private byte defID = 0;
	private Size width = Size.AUTO;
	private int count = 1;
	public static final Columns AUTO = new Columns((byte) 1);
	public static final Columns INHERIT = new Columns((byte) Byte.MAX_VALUE);
	
	private Columns(byte defID) {
		this.defID = defID;
	}
	
	public Columns(double width) {
		this.width = new Size(width);
	}
	
	public Columns(Size width) {
		this.width = width;
	}
	
	public Columns(double width, int count) {
		this.width = new Size(width);
		this.count = count;
	}
	
	public Columns(Size width, int count) {
		this.width = width;
		this.count = count;
	}
	
	public Size width() {
		return width;
	}
	
	public void width(double width) {
		this.width = new Size(width);
	}
	
	public void width(Size width) {
		this.width = width;
	}
	
	public int count() {
		return count;
	}
	
	public void count(int count) {
		this.count = count;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + defID;
		result = prime * result + ( (width == null) ? 0 : width.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Columns other = (Columns) obj;
		if (count != other.count) return false;
		if (defID != other.defID) return false;
		if (width == null) {
			if (other.width != null) return false;
		} else if (!width.equals(other.width)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(Columns to, Animation an) {
		return () -> {
			this.width().animate(to.width(), an).run();
		};
	}

	@Override
	public String css() {
		return this.width() + " " + this.count();
	}
}
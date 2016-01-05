package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class ColumnGap implements Style, Animatable<ColumnGap>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000000CL;
	private byte defID = 0;
	private Size gap = new Size(0);
	public static final ColumnGap NORMAL = new ColumnGap((byte) 1);
	public static final ColumnGap INHERIT = new ColumnGap((byte) Byte.MAX_VALUE);
	
	private ColumnGap(byte defID) {
		this.defID = defID;
	}
	
	public ColumnGap(double length) {
		this.gap = new Size(length);
	}
	
	public ColumnGap(Size length) {
		this.gap = length;
	}
	
	public Size gap() {
		return gap;
	}
	
	public void gap(double length) {
		this.gap = new Size(length);
	}
	
	public void gap(Size length) {
		this.gap = length;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (gap == null) ? 0 : gap.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ColumnGap other = (ColumnGap) obj;
		if (defID != other.defID) return false;
		if (gap == null) {
			if (other.gap != null) return false;
		} else if (!gap.equals(other.gap)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(ColumnGap to, Animation an) {
		return () -> {
			this.gap().animate(to.gap(), an).run();
		};
	}

	@Override
	public String css() {
		return this.gap().toString();
	}
}
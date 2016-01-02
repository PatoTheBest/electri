package net.prefixaut.deadalus.styles;

import java.io.Serializable;

public class ZIndex implements Style, Animatable<ZIndex>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000028L;
	private byte defID = 0;
	private int index = 0;
	public static final ZIndex AUTO = new ZIndex((byte) 1);
	public static final ZIndex INHERIT = new ZIndex((byte) Byte.MAX_VALUE);
	
	private ZIndex(byte defID) {
		this.defID = defID;
	}
	
	public ZIndex(int index) {
		this.index = index;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + index;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ZIndex other = (ZIndex) obj;
		if (defID != other.defID) return false;
		if (index != other.index) return false;
		return true;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	@Override
	public Runnable animate(ZIndex to, Animation an) {
		return () -> {
			// TODO: WELP
		};
	}
}
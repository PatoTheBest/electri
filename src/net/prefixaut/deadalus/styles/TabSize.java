package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.css.Style;

public class TabSize implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000020L;
	private byte defID = 0;
	private boolean important = false;
	private int space = 8;
	private int tab = 0;
	public static final TabSize INHERIT = new TabSize((byte) Byte.MAX_VALUE);
	
	private TabSize(byte defID) {
		this.defID = defID;
	}
	
	public TabSize(int space) {
		this.space = space;
	}
	
	public int getSpace() {
		return space;
	}
	
	public void setSpace(int space) {
		this.tab = 0;
		this.space = space;
	}
	
	public int getTab() {
		return tab;
	}
	
	public void setTab(int tab) {
		this.space = 0;
		this.tab = tab;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + space;
		result = prime * result + tab;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		TabSize other = (TabSize) obj;
		if (defID != other.defID) return false;
		if (space != other.space) return false;
		if (tab != other.tab) return false;
		return true;
	}
	
	@Override
	public String css() {
		return "" + (tab > 0 ? tab * 4 : space);
	}
	
	@Override
	public boolean important() {
		return this.important;
	}
	
	@Override
	public void important(boolean important) {
		this.important = important;
	}
}
package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.css.Style;

@SuppressWarnings("rawtypes")
public class Border<T extends SingleBorder> extends AnimateableRoundableShapeAddition<T>implements Style {
	
	private static final long serialVersionUID = 0x1000200020000008L;
	private byte defID = 0;
	private boolean important = false;
	public static final Border INHERIT = new Border(Byte.MAX_VALUE);
	
	private Border(byte defID) {
		this.defID = defID;
	}
	
	public Border() {}
	
	public Border(T border) {
		super(border);
	}
	
	public Border(T vertical, T horizontal) {
		super(vertical, horizontal);
	}
	
	public Border(T top, T horizontal, T bottom) {
		super(top, horizontal, bottom);
	}
	
	public Border(T top, T right, T bottom, T left) {
		super(top, right, bottom, left);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
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
		Border other = (Border) obj;
		if (defID != other.defID)
			return false;
		return true;
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
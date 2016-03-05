package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.css.Style;

public enum BorderStyle implements Style {
	NONE,
	HIDDEN,
	DOTTED,
	DASHED,
	SOLID,
	DOUBLE,
	GROOVE,
	RIDGE,
	INSET,
	OUSET,
	INHERIT;
	
	private boolean important = false;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
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
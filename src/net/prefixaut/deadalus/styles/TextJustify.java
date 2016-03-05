package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.css.Style;

public enum TextJustify implements Style {
	AUTO,
	INTER_WORD,
	INTER_IDEOGRAPH,
	INTER_CLUSTER,
	DISTRIBUTE,
	KASHIDA,
	TRIM,
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
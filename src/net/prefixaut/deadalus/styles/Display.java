package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.css.Style;

public enum Display implements Style {
	INLINE,
	BLOCK,
	FLEX,
	INLINE_BLOCK,
	INLINE_FLEX,
	INLINE_TABLE,
	LIST_ITEM,
	RUN_IN,
	TABLE,
	TABLE_CAPTION,
	TABLE_COLUMN_GROUP,
	TABLE_HEADER_GROUP,
	TABLE_FOOTER_GROUP,
	TABLE_ROW_GROUP,
	TABLE_CELL,
	TABLE_COLUMN,
	TABLE_ROW,
	INHERIT,
	NONE;
	
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
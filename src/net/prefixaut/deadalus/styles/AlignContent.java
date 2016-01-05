package net.prefixaut.deadalus.styles;

public enum AlignContent implements Style {
	STRETCH,
	CENTER,
	FLEX_START,
	FLEX_END,
	SPACE_BETWEEN,
	SPACE_AROUND,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
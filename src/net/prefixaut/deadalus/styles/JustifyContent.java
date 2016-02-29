package net.prefixaut.deadalus.styles;

public enum JustifyContent implements Style {
	FLEX_START,
	FLEX_END,
	CENTER,
	SPACE_BETWEEN,
	SPACE_AROUND,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
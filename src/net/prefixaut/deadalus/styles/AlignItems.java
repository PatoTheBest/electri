package net.prefixaut.deadalus.styles;

public enum AlignItems implements Style {
	STRETCH,
	CENTER,
	FLEX_START,
	FLEX_END,
	BASELINE,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
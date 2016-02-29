package net.prefixaut.deadalus.styles;

public enum PageBreak implements Style {
	AUTO,
	ALWAYS,
	AVOID,
	LEFT,
	RIGHT,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
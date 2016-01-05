package net.prefixaut.deadalus.styles;

public enum Float implements Style {
	NONE,
	LEFT,
	RIGHT,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
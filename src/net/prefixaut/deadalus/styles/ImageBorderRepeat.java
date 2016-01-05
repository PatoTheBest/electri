package net.prefixaut.deadalus.styles;

public enum ImageBorderRepeat implements Style {
	STRETCH,
	REPEAT,
	ROUND,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
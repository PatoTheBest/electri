package net.prefixaut.deadalus.styles;

public enum TextAlign implements Style {
	LEFT,
	RIGHT,
	CENTER,
	JUSTIFY,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
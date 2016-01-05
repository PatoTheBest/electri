package net.prefixaut.deadalus.styles;

public enum TextAlignLast implements Style {
	AUTO,
	LEFT,
	RIGHT,
	CENTER,
	JUSTIFY,
	START,
	END,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
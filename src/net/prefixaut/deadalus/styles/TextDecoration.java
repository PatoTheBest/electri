package net.prefixaut.deadalus.styles;

public enum TextDecoration implements Style {
	NONE,
	UNDERLINE,
	OVERLINE,
	LINE_THROUGH,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
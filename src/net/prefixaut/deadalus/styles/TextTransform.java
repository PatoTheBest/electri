package net.prefixaut.deadalus.styles;

public enum TextTransform implements Style {
	NONE,
	CAPTIALIZE,
	UPPERCASE,
	LOWERCASE,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
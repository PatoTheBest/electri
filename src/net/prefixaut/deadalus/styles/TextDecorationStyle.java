package net.prefixaut.deadalus.styles;

public enum TextDecorationStyle implements Style {
	SOLID,
	DOUBLE,
	DOTTED,
	DASHED,
	WAVY,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
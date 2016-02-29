package net.prefixaut.deadalus.styles;

public enum FontStyle implements Style {
	NORMAL,
	ITALIC,
	OBLIQUE,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
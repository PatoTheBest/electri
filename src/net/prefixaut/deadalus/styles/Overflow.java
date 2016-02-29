package net.prefixaut.deadalus.styles;

public enum Overflow implements Style {
	VISIBLE,
	HIDDEN,
	SCROLL,
	AUTO,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
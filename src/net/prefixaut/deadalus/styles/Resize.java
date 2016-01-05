package net.prefixaut.deadalus.styles;

public enum Resize implements Style {
	NONE,
	BOTH,
	HORIZONTAL,
	VERTICAL,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
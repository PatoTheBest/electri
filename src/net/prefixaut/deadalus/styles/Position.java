package net.prefixaut.deadalus.styles;

public enum Position implements Style {
	ABSOLUTE,
	RELATIVE,
	FIXED,
	STATIC;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
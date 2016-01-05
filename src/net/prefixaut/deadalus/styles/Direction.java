package net.prefixaut.deadalus.styles;

public enum Direction implements Style {
	LTR,
	RTL,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
package net.prefixaut.deadalus.styles;

public enum Clear implements Style {
	NONE,
	LEFT,
	RIGHT,
	BOTH,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
package net.prefixaut.deadalus.styles;

public enum BackfaceVisibility implements Style {
	VISIBLE,
	HIDDEN,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
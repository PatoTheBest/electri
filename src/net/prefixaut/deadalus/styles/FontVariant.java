package net.prefixaut.deadalus.styles;

public enum FontVariant implements Style {
	NORMAL,
	SMALL_CAPS,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
package net.prefixaut.deadalus.styles;

public enum CaptionSide implements Style {
	TOP,
	BOTTOM,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
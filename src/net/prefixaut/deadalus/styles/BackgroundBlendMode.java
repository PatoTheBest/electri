package net.prefixaut.deadalus.styles;

public enum BackgroundBlendMode implements Style {
	NORMAL,
	MULTIPLY,
	SCREEN,
	OVERLAY,
	DARKEN,
	LIGHTEN,
	COLOR_DODGE,
	SATURATION,
	COLOR,
	LUMINOSITY;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
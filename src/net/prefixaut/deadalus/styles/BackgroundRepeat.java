package net.prefixaut.deadalus.styles;

public enum BackgroundRepeat implements Style {
	REPEAT,
	REPEAT_X,
	REPEAT_Y,
	NONE,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
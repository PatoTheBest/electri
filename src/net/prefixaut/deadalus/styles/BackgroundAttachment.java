package net.prefixaut.deadalus.styles;

public enum BackgroundAttachment implements Style {
	SCROLL,
	FIXED,
	LOCAL,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
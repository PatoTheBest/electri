package net.prefixaut.deadalus.styles;

public enum BackgroundOrigin implements Style {
	PADDING_BOX,
	BORDER_BOX,
	CONTENT_BOX,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
package net.prefixaut.deadalus.styles;

public enum BackgroundClip implements Style {
	BORDER_BOX,
	PADDING_BOX,
	CONTENT_BOX,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
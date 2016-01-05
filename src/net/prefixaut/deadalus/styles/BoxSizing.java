package net.prefixaut.deadalus.styles;

public enum BoxSizing implements Style {
	CONTENT_BOX,
	BORDER_BOX,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
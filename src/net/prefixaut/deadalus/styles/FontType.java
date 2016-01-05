package net.prefixaut.deadalus.styles;

public enum FontType implements Style {
	SERIF,
	SANS_SERIF,
	MONOSPACE;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
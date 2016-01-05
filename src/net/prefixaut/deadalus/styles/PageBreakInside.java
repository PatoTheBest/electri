package net.prefixaut.deadalus.styles;

public enum PageBreakInside implements Style {
	AUTO,
	AVOID,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
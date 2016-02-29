package net.prefixaut.deadalus.styles;

public enum AlignSelf implements Style {
	AUTO,
	STRETCH,
	CENTER,
	FLEX_START,
	FLEX_END,
	BASELINE,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
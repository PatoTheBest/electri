package net.prefixaut.deadalus.styles;

public enum WhiteSpace implements Style {
	NORMAL,
	NOWRAP,
	PRE,
	PRE_LINE,
	PRE_WRAP,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
package net.prefixaut.deadalus.styles;

public enum WordWrap implements Style {
	NORMAL,
	BREAK_WORD,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
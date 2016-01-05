package net.prefixaut.deadalus.styles;

public enum WordBreak implements Style {
	NORMAL,
	BREAK_ALL,
	KEEP_ALL,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
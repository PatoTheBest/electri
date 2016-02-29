package net.prefixaut.deadalus.styles;

public enum EmptyCells implements Style {
	SHOW,
	HIDE,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
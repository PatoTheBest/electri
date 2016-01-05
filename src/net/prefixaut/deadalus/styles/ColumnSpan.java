package net.prefixaut.deadalus.styles;

public enum ColumnSpan implements Style {
	ONE,
	ALL,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
package net.prefixaut.deadalus.styles;

public enum TableLayout implements Style {
	AUTO,
	FIXED,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
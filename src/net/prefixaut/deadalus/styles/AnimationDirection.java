package net.prefixaut.deadalus.styles;

public enum AnimationDirection implements Style {
	NORMAL,
	REVERSE,
	ALTERNATE,
	ALTERNATE_REVERSE,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
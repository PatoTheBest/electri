package net.prefixaut.deadalus.styles;

public enum TransitionTiming implements Style {
	EASE,
	LINEAR,
	EASE_IN,
	EASE_OUT,
	EASE_IN_OUT,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
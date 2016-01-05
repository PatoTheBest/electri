package net.prefixaut.deadalus.styles;

public enum AnimationFillMode implements Style {
	NONE,
	FORWARDS,
	BACKWARDS,
	BOTH,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
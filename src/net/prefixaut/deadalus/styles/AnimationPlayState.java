package net.prefixaut.deadalus.styles;

public enum AnimationPlayState implements Style {
	PAUSED,
	RUNNING,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
package net.prefixaut.deadalus.styles;

public enum HangingPunctuation implements Style {
	NONE,
	FIRST,
	LAST,
	ALLOW_END,
	FORCE_END,
	INHERIT;
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
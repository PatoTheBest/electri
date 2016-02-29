package net.prefixaut.deadalus.styles;

public enum UnicodeBidi implements Style {
	NORMAL,
	EMBED,
	BIDI_OVERRIDE,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
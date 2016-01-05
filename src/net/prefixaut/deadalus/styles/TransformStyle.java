package net.prefixaut.deadalus.styles;

public enum TransformStyle implements Style {
	FLAT,
	PRESERVE_3D,
	INHERIT;

	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
}
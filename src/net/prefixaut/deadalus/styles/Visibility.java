package net.prefixaut.deadalus.styles;

public enum Visibility implements Style, Animatable<Visibility> {
	VISIBLE,
	HIDDEN,
	COLLAPSE;

	@Override
	public Runnable animate(Visibility to, Animation an) {
		return () -> {
			// TODO: Defuq? XD
		};
	}
}
package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.css.Style;

public enum Visibility implements Style,Animatable<Visibility> {
	VISIBLE,
	HIDDEN,
	COLLAPSE;
	
	private boolean important = false;
	
	@Override
	public Runnable animate(Visibility to, Animation an) {
		return () -> {
			// TODO: Defuq? XD
		};
	}
	
	@Override
	public String css() {
		return this.name().contains("_") ? this.name().toLowerCase().replaceAll("_", "-") : this.name().toLowerCase();
	}
	
	@Override
	public boolean important() {
		return this.important;
	}
	
	@Override
	public void important(boolean important) {
		this.important = important;
	}
}
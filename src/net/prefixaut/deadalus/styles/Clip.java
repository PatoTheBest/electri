package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.css.Style;

public class Clip implements Style, Animatable<Clip> {
	
	private boolean important = false;
	
	// TODO: Everything
	@Override
	public Runnable animate(Clip to, Animation animation) {
		return null;
	}
	
	@Override
	public String css() {
		return null;
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
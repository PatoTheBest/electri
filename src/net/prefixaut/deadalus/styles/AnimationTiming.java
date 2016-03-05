package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.css.Style;

public interface AnimationTiming extends Style {
	
	public abstract String name();
	
	public abstract long timing(double fps, long duration, long currentFrame);
}
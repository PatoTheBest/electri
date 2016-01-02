package net.prefixaut.deadalus.styles;


public interface AnimationTiming extends Style {
	
	public abstract String getTimingName();
	
	public abstract long getTiming(double fps, long duration, long currentFrame);
}
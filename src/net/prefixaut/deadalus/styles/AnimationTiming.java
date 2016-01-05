package net.prefixaut.deadalus.styles;

public interface AnimationTiming extends Style {
	
	public abstract String name();
	
	public abstract long timing(double fps, long duration, long currentFrame);
}
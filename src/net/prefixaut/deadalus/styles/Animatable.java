package net.prefixaut.deadalus.styles;

public interface Animatable<T> {
		
	public Runnable animate(T to, Animation animation);
}
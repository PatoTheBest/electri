package net.prefixaut.deadalus.css;

public interface MediaFeatureType<T extends Comparable<T>> {
	
	public boolean check(T value);
}
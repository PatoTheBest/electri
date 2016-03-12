package net.prefixaut.deadalus;


public interface Audio extends PlayMedia {
	
	public double volume();
	public void volume(double volume);
	
	// Audio Meta-Data
	public String title();
	public void title(String title);
}
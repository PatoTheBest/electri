package net.prefixaut.deadalus;


public interface Video extends Audio {
	
	public Image frame(long frame);
	
	// Video Meta-Data
	public String title();
	public void title(String title);
	
	public Image thumbnail();
}
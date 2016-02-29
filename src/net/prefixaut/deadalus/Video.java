package net.prefixaut.deadalus;


public interface Video extends PlayableMedia, Audio {
	
	// Position
	public long lenght();
	public long time();
	public void time(long time);
	public Image frame(long frame);
}
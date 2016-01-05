package net.prefixaut.deadalus;


public interface Video extends Media, Audio {
	
	// Control Getters
	public boolean play();
	public boolean pause();
	public boolean stop();
	
	// Control Setters
	public boolean playing();
	public boolean paused();
	public boolean stopped();
	
	// Position
	public long lenght();
	public long time();
	public void time(long time);
	public Image frame(long frame);
}
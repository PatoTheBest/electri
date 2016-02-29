package net.prefixaut.deadalus;


public interface PlayableMedia extends Media {
	
	// Control Getters
	public boolean play();
	
	public boolean pause();
	
	public boolean stop();
	
	// Control Setters
	public boolean playing();
	
	public boolean paused();
	
	public boolean stopped();
}

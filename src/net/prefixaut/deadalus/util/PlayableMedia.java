package net.prefixaut.deadalus.util;

public interface PlayableMedia {
	
	public boolean play();
	
	public boolean pause();
	
	public boolean stop();
	
	public boolean next();
	
	public boolean previous();
	
	public boolean goToTime(long milliseconds);
	
	public boolean goToPercent(double percent);
	
	public long length();
	
	public long currentTime();
}
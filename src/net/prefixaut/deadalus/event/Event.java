package net.prefixaut.deadalus.event;

public interface Event {
	
	public boolean cancelled();
	
	public void cancelled(boolean cancel);
}
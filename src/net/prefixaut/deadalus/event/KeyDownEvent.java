package net.prefixaut.deadalus.event;

import net.prefixaut.deadalus.Key;

public class KeyDownEvent implements Event {
	
	private Key key;
	private boolean canceled = false;
	
	public KeyDownEvent(Key key) {
		this.key = key;
	}
	
	public Key getKey() {
		return this.key;
	}
	
	@Override
	public boolean cancelled() {
		return this.canceled;
	}
	
	@Override
	public void cancelled(boolean canceled) {
		this.canceled = canceled;
	}
}
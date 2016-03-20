package net.prefixaut.deadalus.event.window;

import net.prefixaut.deadalus.event.Event;

public class WindowResizeEvent implements Event {
	
	private int fromWidth, fromHeight, toWidth, toHeight;
	private boolean cancel;
	
	public WindowResizeEvent(int fromWidth, int fromHeight, int toWidth, int toHeight) {
		this.fromWidth = fromWidth;
		this.fromHeight = fromHeight;
		this.toWidth = toWidth;
		this.toHeight = toHeight;
	}
	
	public int fromWidth() {
		return fromWidth;
	}
	
	public int fromHeight() {
		return fromHeight;
	}
	
	public int toWidth() {
		return toWidth;
	}
	
	public int toHeight() {
		return toHeight;
	}
	
	@Override
	public boolean cancelled() {
		return this.cancel;
	}
	
	@Override
	public void cancelled(boolean cancel) {
		this.cancel = cancel;
	}
}
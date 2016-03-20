package net.prefixaut.deadalus.event.window;

import net.prefixaut.deadalus.event.Event;

public class WindowMoveEvent implements Event {
	
	private int xFrom, yFrom, xTo, yTo;
	private boolean cancel;
	
	public WindowMoveEvent(int xFrom, int yFrom, int xTo, int yTo) {
		this.xFrom = xFrom;
		this.yFrom = yFrom;
		this.xTo = xTo;
		this.yTo = yTo;
	}
	
	public int xFrom() {
		return xFrom;
	}
	
	public int yFrom() {
		return yFrom;
	}
	
	public int xTo() {
		return xTo;
	}
	
	public int yTo() {
		return yTo;
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
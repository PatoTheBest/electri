package net.prefixaut.deadalus.event.mouse;

import net.prefixaut.deadalus.event.Event;

public class MouseMoveEvent implements Event {
	
	private boolean cancel = false;
	private int xFrom, yFrom, xTo, yTo;
	
	public MouseMoveEvent(int xFrom, int yFrom, int xTo, int yTo) {
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
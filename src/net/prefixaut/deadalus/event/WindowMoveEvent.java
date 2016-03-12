package net.prefixaut.deadalus.event;

public class WindowMoveEvent implements Event {
	
	private int xFrom, yFrom, xTo, yTo;
	private boolean canceled;
	
	public WindowMoveEvent(int xFrom, int yFrom, int xTo, int yTo) {
		this.xFrom = xFrom;
		this.yFrom = yFrom;
		this.xTo = xTo;
		this.yTo = yTo;
	}
	
	public int getXFrom() {
		return xFrom;
	}
	
	public int getYFrom() {
		return yFrom;
	}
	
	public int getXTo() {
		return xTo;
	}
	
	public int getYTo() {
		return yTo;
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
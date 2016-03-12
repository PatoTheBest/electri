package net.prefixaut.deadalus.event;

public class MouseMoveEvent implements Event {
	
	private boolean cancel = false;
	private int xFrom, yFrom, xTo, yTo;
	
	public MouseMoveEvent(int xFrom, int yFrom, int xTo, int yTo) {
		this.xFrom = xFrom;
		this.yFrom = yFrom;
		this.xTo = xTo;
		this.yTo = yTo;
	}
	
	public int getxFrom() {
		return xFrom;
	}
	
	public int getyFrom() {
		return yFrom;
	}
	
	public int getxTo() {
		return xTo;
	}
	
	public int getyTo() {
		return yTo;
	}
	
	@Override
	public boolean cancelled() {
		return this.cancel;
	}
	
	@Override
	public void cancelled(boolean canceled) {
		this.cancel = canceled;
	}
}
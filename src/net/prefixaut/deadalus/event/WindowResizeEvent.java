package net.prefixaut.deadalus.event;

public class WindowResizeEvent implements Event {
	
	private int fromWidth, fromHeight, toWidth, toHeight;
	private boolean canceled;
	
	public WindowResizeEvent(int fromWidth, int fromHeight, int toWidth, int toHeight) {
		this.fromWidth = fromWidth;
		this.fromHeight = fromHeight;
		this.toWidth = toWidth;
		this.toHeight = toHeight;
	}
	
	public int getFromWidth() {
		return fromWidth;
	}
	
	public int getFromHeight() {
		return fromHeight;
	}
	
	public int getToWidth() {
		return toWidth;
	}
	
	public int getToHeight() {
		return toHeight;
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
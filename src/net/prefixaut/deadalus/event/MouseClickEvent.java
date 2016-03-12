package net.prefixaut.deadalus.event;

import net.prefixaut.deadalus.MouseClick;

public class MouseClickEvent implements Event {
	
	private MouseClick mouseClick;
	private boolean canceled;
	
	public MouseClickEvent(MouseClick mouseClick) {
		this.mouseClick = mouseClick;
	}
	
	public MouseClick getMouseClick() {
		return this.mouseClick;
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
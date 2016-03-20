package net.prefixaut.deadalus.event.mouse;

import net.prefixaut.deadalus.MouseClick;
import net.prefixaut.deadalus.event.Event;

public class MouseClickEvent implements Event {

	private boolean cancel = false;
	private MouseClick click;
	
	public MouseClickEvent(MouseClick click) {
		this.click = click;
	}
	
	public MouseClick click() {
		return this.click;
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
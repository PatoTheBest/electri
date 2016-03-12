package net.prefixaut.deadalus.event;

import net.prefixaut.deadalus.Component;
import net.prefixaut.deadalus.css.StyleState;

public class StyleStateChangeEvent implements Event {
	
	private boolean cancel = false;
	private Component component;
	private StyleState from, to;
	
	public StyleStateChangeEvent(Component component, StyleState from, StyleState to) {
		this.component = component;
		this.from = from;
		this.to = to;
	}
	
	public Component component() {
		return this.component;
	}
	
	public StyleState from() {
		return this.from;
	}
	
	public StyleState to() {
		return this.to;
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
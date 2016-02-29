package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Web extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Web() {
		super("web");
		this.allowChildren = false;
	}
	
	public Web(Component parent) {
		super("web", parent);
		this.allowChildren = false;
	}
}
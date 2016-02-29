package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Button extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Button() {
		super("btn");
		this.allowChildren = false;
	}
	
	public Button(Component parent) {
		super("btn", parent);
	}
}
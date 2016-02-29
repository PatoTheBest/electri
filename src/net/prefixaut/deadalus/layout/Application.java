package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Application extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;

	public Application() {
		super("app");
		this.allowChildren = false;
	}
	
	public Application(Component parent) {
		super("app", parent);
		this.allowChildren = false;
	}
}
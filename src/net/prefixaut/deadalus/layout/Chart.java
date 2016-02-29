package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Chart extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Chart() {
		super("crt");
		this.allowChildren = false;
	}
	
	public Chart(Component parent) {
		super("crt", parent);
		this.allowChildren = false;
	}
}
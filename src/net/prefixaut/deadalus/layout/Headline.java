package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Headline extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Headline() {
		super("hdl");
		this.allowChildren = false;
	}
	
	public Headline(Component parent) {
		super("hdl", parent);
		this.allowChildren = false;
	}
}
package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Slider extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Slider() {
		super("sld");
		this.allowChildren = false;
	}
	
	public Slider(Component parent) {
		super("sld", parent);
		this.allowChildren = false;
	}
}
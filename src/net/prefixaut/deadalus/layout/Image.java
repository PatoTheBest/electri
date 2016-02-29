package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Image extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Image() {
		super("img");
		this.allowChildren = false;
	}
	
	public Image(Component parent) {
		super("img", parent);
		this.allowChildren = false;
	}
}
package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Video extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Video() {
		super("vdo");
		this.allowChildren = false;
	}
	
	public Video(Component parent) {
		super("vdo", parent);
		this.allowChildren = false;
	}
}

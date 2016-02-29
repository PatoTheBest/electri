package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class Field<T> extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Field() {
		super("fld");
		this.allowChildren = false;
	}
	
	public Field(Component parent) {
		super("fld", parent);
		this.allowChildren = false;
	}
}
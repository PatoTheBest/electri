package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.BasicComponent;
import net.prefixaut.deadalus.Component;

public class RadioButton extends BasicComponent {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public RadioButton() {
		super("rdo");
		this.allowChildren = false;
	}
	
	public RadioButton(Component parent) {
		super("rdo", parent);
		this.allowChildren = false;
	}
}
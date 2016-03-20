package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.Component;

public class Field<T> extends Component {
	
	// TODO: Change it
	private static final long serialVersionUID = 0;
	
	public Field() {
		super();
		this.allowChildren = false;
	}
	
	public Field(Component parent) {
		super(parent);
		this.allowChildren = false;
	}
}
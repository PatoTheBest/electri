package net.prefixaut.deadalus.layout;

import net.prefixaut.deadalus.Component;

public class Script extends Component {
	
	// TODO: Change
	private static final long serialVersionUID = 0;
	
	public Script() {
		super("script");
		this.allowChildren = false;
	}
	
	public Script(Component parent) {
		super("script", parent);
		this.allowChildren = false;
	}
}
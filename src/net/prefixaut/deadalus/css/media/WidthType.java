package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.Size;

public class WidthType extends LengthType {
	
	public WidthType(double width, TypeDefinition type) {
		super(width, type);
	}
	
	public WidthType(double width) {
		super(width);
	}
	
	public WidthType(Size width, TypeDefinition type) {
		super(width, type);
	}
	
	public WidthType(Size width) {
		super(width);
	}
	
	public WidthType(TypeDefinition type, double width) {
		super(type, width);
	}
	
	public WidthType(TypeDefinition type, Size width) {
		super(type, width);
	}
	
	@Override
	public String toString() {
		String pre = this.getType()== TypeDefinition.MAX ? "max-" : (this.getType() == TypeDefinition.MIN ? "min-" : "");
		return pre + "width: " + super.toString();
	}
}
package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.Size;

public class HeightType extends LengthType {
	
	public HeightType(double width, TypeDefinition type) {
		super(width, type);
	}
	
	public HeightType(double width) {
		super(width);
	}
	
	public HeightType(Size width, TypeDefinition type) {
		super(width, type);
	}
	
	public HeightType(Size width) {
		super(width);
	}
	
	public HeightType(TypeDefinition type, double width) {
		super(type, width);
	}
	
	public HeightType(TypeDefinition type, Size width) {
		super(type, width);
	}
	
	@Override
	public String toString() {
		String pre = this.getType()== TypeDefinition.MAX ? "max-" : (this.getType() == TypeDefinition.MIN ? "min-" : "");
		return pre + "height: " + super.toString();
	}
}
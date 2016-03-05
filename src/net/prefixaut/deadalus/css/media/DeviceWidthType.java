package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.Size;

public class DeviceWidthType extends LengthType {
	
	public DeviceWidthType(double width, TypeDefinition type) {
		super(width, type);
	}
	
	public DeviceWidthType(double width) {
		super(width);
	}
	
	public DeviceWidthType(Size width, TypeDefinition type) {
		super(width, type);
	}
	
	public DeviceWidthType(Size width) {
		super(width);
	}
	
	public DeviceWidthType(TypeDefinition type, double width) {
		super(type, width);
	}
	
	public DeviceWidthType(TypeDefinition type, Size width) {
		super(type, width);
	}
	
	@Override
	public String toString() {
		String pre = this.getType()== TypeDefinition.MAX ? "max-" : (this.getType() == TypeDefinition.MIN ? "min-" : "");
		return pre + "device-height: " + super.toString();
	}
}
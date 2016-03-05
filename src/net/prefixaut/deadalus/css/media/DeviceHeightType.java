package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.Size;

public class DeviceHeightType extends LengthType {
	
	public DeviceHeightType(double width, TypeDefinition type) {
		super(width, type);
	}
	
	public DeviceHeightType(double width) {
		super(width);
	}
	
	public DeviceHeightType(Size width, TypeDefinition type) {
		super(width, type);
	}
	
	public DeviceHeightType(Size width) {
		super(width);
	}
	
	public DeviceHeightType(TypeDefinition type, double width) {
		super(type, width);
	}
	
	public DeviceHeightType(TypeDefinition type, Size width) {
		super(type, width);
	}
	
	@Override
	public String toString() {
		String pre = this.getType()== TypeDefinition.MAX ? "max-" : (this.getType() == TypeDefinition.MIN ? "min-" : "");
		return pre + "device-height: " + super.toString();
	}
}
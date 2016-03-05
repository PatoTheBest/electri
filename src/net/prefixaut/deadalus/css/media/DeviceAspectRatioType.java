package net.prefixaut.deadalus.css.media;

public class DeviceAspectRatioType extends AspectRatioType {
	
	public DeviceAspectRatioType(int horizontal, int vertical, TypeDefinition type) {
		super(horizontal, vertical, type);
	}
	
	public DeviceAspectRatioType(int horizontal, int vertical) {
		super(horizontal, vertical);
	}
	
	public DeviceAspectRatioType(TypeDefinition type, int horizontal, int vertical) {
		super(type, horizontal, vertical);
	}
	
	@Override
	public String toString() {
		String pre = this.getType()== TypeDefinition.MAX ? "max-" : (this.getType() == TypeDefinition.MIN ? "min-" : "");
		return pre + "device-aspect-ratio: " + super.toString();
	}
}
package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.css.MediaFeatureType;

public class LengthType implements MediaFeatureType<Size> {
	
	private TypeDefinition type = TypeDefinition.NORMAL;
	private Size length;
	
	public LengthType(Size width) {
		this.length = width;
	}
	
	public LengthType(double width) {
		this.length = new Size(width);
	}
	
	public LengthType(TypeDefinition type, Size width) {
		this(width);
		this.type = type;
	}
	
	public LengthType(Size width, TypeDefinition type) {
		this(width);
		this.type = type;
	}
	
	public LengthType(TypeDefinition type, double width) {
		this(width);
		this.type = type;
	}
	
	public LengthType(double width, TypeDefinition type) {
		this(width);
		this.type = type;
	}
	
	public TypeDefinition getType() {
		return type;
	}
	
	public void setType(TypeDefinition type) {
		this.type = type;
	}
	
	public Size getLength() {
		return length;
	}
	
	public void setLength(Size width) {
		this.length = width;
	}
	
	@Override
	public boolean check(Size value) {
		switch (type) {
			case NORMAL: return this.length.compareTo(value) == 0;
			case MIN: return this.length.compareTo(value) >= 0;
			case MAX: return this.length.compareTo(value) <= 0;
			default: return false;
		}
	}
}
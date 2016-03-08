package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.css.MediaFeatureType;
import net.prefixaut.prelib.AspectRatio;

public class AspectRatioType extends AspectRatio implements MediaFeatureType<AspectRatio> {
	
	private TypeDefinition type = TypeDefinition.NORMAL;
	
	public AspectRatioType(int horizontal, int vertical) {
		super(horizontal, vertical);
	}
	
	public AspectRatioType(TypeDefinition type, int horizontal, int vertical) {
		super(horizontal, vertical);
		this.type = type;
	}
	
	public AspectRatioType(int horizontal, int vertical, TypeDefinition type) {
		super(horizontal, vertical);
		this.type = type;
	}
	
	public TypeDefinition getType() {
		return type;
	}
	
	public void setType(TypeDefinition type) {
		this.type = type;
	}
	
	@Override
	public boolean check(AspectRatio value) {
		switch (type) {
			case NORMAL:
				return this.compareTo(value) == 0;
			case MIN:
				return this.compareTo(value) >= 0;
			case MAX:
				return this.compareTo(value) <= 0;
			default:
				return false;
		}
	}
	
	@Override
	public String toString() {
		String pre = this.getType()== TypeDefinition.MAX ? "max-" : (this.getType() == TypeDefinition.MIN ? "min-" : "");
		return pre + "aspect-ratio: " + super.toString();
	}
}
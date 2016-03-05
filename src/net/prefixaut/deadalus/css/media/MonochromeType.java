package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.css.MediaFeatureType;

public class MonochromeType implements MediaFeatureType<Integer> {
	
	private TypeDefinition type = TypeDefinition.NORMAL;
	private int monochrome = 0;
	
	public MonochromeType(int monochrome) {
		this.monochrome = monochrome >= 0 ? monochrome : 0;
	}
	
	public MonochromeType(TypeDefinition type, int monochrome) {
		this(monochrome);
		this.type = type;
	}
	
	public MonochromeType(int monochrome, TypeDefinition type) {
		this(monochrome);
		this.type = type;
	}
	
	public TypeDefinition getType() {
		return type;
	}
	
	public void setType(TypeDefinition type) {
		this.type = type;
	}
	
	public int getMonochrome() {
		return monochrome;
	}
	
	public void setMonochrome(int monochrome) {
		this.monochrome = monochrome;
	}
	
	@Override
	public boolean check(Integer value) {
		switch (type) {
			case NORMAL:
				return this.monochrome == value;
			case MIN:
				return this.monochrome >= value;
			case MAX:
				return this.monochrome <= value;
			default:
				return false;
		}
	}
	
	@Override
	public String toString() {
		String pre = type == TypeDefinition.MAX ? "max-" : (type == TypeDefinition.MIN ? "min-" : "");
		return pre + "monochrome: " + super.toString();
	}
}
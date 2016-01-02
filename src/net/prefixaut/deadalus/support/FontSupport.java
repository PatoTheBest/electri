package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.styles.Font;
import net.prefixaut.deadalus.styles.FontFamily;
import net.prefixaut.deadalus.styles.FontStyle;
import net.prefixaut.deadalus.styles.FontType;
import net.prefixaut.deadalus.styles.FontVariant;

public interface FontSupport {
	
	public void setFont(Font font);
	
	public Font getFont();
	
	public default void setFontFamily(FontFamily family) {
		Font f = this.getFont();
		f.setFamily(family);
		this.setFont(f);
	}
	
	public default FontFamily getFontFamily() {
		return this.getFont().getFamily();
	}
	
	public default String getFontFamilyName() {
		return this.getFontFamily().getName();
	}
	
	public default String getFontFamilyAuthor() {
		return this.getFontFamily().getAuthor();
	}
	
	public default String getFontFamilyCopyright() {
		return this.getFontFamily().getCopyright();
	}
	
	public default FontType getFontFamilyType() {
		return this.getFontFamily().getType();
	}
	
	public default void setFontSize(double size) {
		this.setFontSize(new Size(size));
	}
	
	public default void setFontSize(Size size) {
		Font f = this.getFont();
		f.setSize(size);
		this.setFont(f);
	}
	
	public default Size getFontSize() {
		return this.getFont().getSize();
	}
	
	public default void setFontWeight(int weight) {
		Font f = this.getFont();
		f.setWeight(weight);
		this.setFont(f);
	}
	
	public default int getFontWeight() {
		return this.getFont().getWeight();
	}
	
	public default void setFontStyle(FontStyle style) {
		Font f = this.getFont();
		f.setStyle(style);
		this.setFont(f);
	}
	
	public default FontStyle getFontStyle() {
		return this.getFont().getStyle();
	}
	
	public default void setFontVariant(FontVariant variant) {
		Font f = this.getFont();
		f.setVariant(variant);
		this.setFont(f);
	}
	
	public default FontVariant getFontVariant() {
		return this.getFont().getVariant();
	}
}
package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.util.CSS3;

public class Font implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000012L;
	private FontFamily family;
	private Size size = new Size(16);
	private int weight = CSS3.FontWeight.INITIAL;
	private FontStyle style = FontStyle.NORMAL;
	private FontVariant variant = FontVariant.NORMAL;
	
	public Font(FontFamily family) {
		this.family = family;
	}
	
	public Font(FontFamily family, Size size) {
		this.family = family;
		this.size = size;
	}
	
	public Font(FontFamily family, Size size, int weight) {
		this.family = family;
		this.size = size;
		this.weight = weight;
	}
	
	public Font(FontFamily family, Size size, int weight, FontStyle style) {
		this.family = family;
		this.size = size;
		this.weight = weight;
		this.style = style;
	}
	
	public Font(FontFamily family, Size size, int weight, FontVariant variant) {
		this.family = family;
		this.size = size;
		this.weight = weight;
		this.variant = variant;
	}
	
	public Font(FontFamily family, Size size, int weight, FontStyle style, FontVariant variant) {
		this.family = family;
		this.size = size;
		this.weight = weight;
		this.style = style;
		this.variant = variant;
	}
	
	public Font(FontFamily family, Size size, int weight, FontVariant variant, FontStyle style) {
		this.family = family;
		this.size = size;
		this.weight = weight;
		this.style = style;
		this.variant = variant;
	}
	
	public FontFamily getFamily() {
		return family;
	}
	
	public void setFamily(FontFamily family) {
		this.family = family;
	}
	
	public Size getSize() {
		return size;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public FontStyle getStyle() {
		return style;
	}
	
	public void setStyle(FontStyle style) {
		this.style = style;
	}
	
	public FontVariant getVariant() {
		return variant;
	}
	
	public void setVariant(FontVariant variant) {
		this.variant = variant;
	}
}
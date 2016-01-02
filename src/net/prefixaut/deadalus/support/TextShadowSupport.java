package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.Color;
import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.styles.TextShadow;

public interface TextShadowSupport {
	
	public void setTextShadow(TextShadow shadow);
	
	public TextShadow getTextShadow();
	
	public default void setTextShadowBlur(Size blur) {
		TextShadow t = this.getTextShadow();
		t.setBlur(blur);
		this.setTextShadow(t);
	}
	
	public default Size getTextShadowBlur() {
		return this.getTextShadow().getBlur();
	}
	
	public default void setTextShadowColor(Color color) {
		TextShadow t = this.getTextShadow();
		t.setColor(color);
		this.setTextShadow(t);
	}
	
	public default Color getTextShadowColor() {
		return this.getTextShadow().getColor();
	}
	
	public default void setTextShadowLength(Size length) {
		TextShadow t = this.getTextShadow();
		t.setLength(length);
		this.setTextShadow(t);
	}
	
	public default Size getTextShadowLength() {
		return this.getTextShadow().getLength();
	}
	
	public default void setTextShadowWidth(Size width) {
		TextShadow t = this.getTextShadow();
		t.setWidth(width);
		this.setTextShadow(t);
	}
	
	public default Size getTextShadowWidth() {
		return this.getTextShadow().getWidth();
	}
}
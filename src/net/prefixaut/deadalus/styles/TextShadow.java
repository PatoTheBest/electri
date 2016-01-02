package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Color;
import net.prefixaut.deadalus.Size;

public class TextShadow implements Style, Animatable<TextShadow>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000023L;
	private Size length = new Size(0), width = new Size(0), blur = new Size(0);
	private Color color = Color.BLACK;
	
	public TextShadow(Size length, Size width) {
		this.length = length;
		this.width = width;
	}
	
	public TextShadow(Size length, Size width, Size blur) {
		this.length = length;
		this.width = width;
		this.blur = blur;
	}
	
	public TextShadow(Size length, Size width, Color color) {
		this.length = length;
		this.width = width;
		this.color = color;
	}
	
	public TextShadow(Size length, Size width, Color color, Size blur) {
		this.length = length;
		this.width = width;
		this.color = color;
		this.blur = blur;
	}
	
	public TextShadow(Size length, Size width, Size blur, Color color) {
		this.length = length;
		this.width = width;
		this.blur = blur;
		this.color = color;
	}
	
	public Size getLength() {
		return length;
	}
	
	public void setLength(Size length) {
		this.length = length;
	}
	
	public Size getWidth() {
		return width;
	}
	
	public void setWidth(Size width) {
		this.width = width;
	}
	
	public Size getBlur() {
		return blur;
	}
	
	public void setBlur(Size blur) {
		this.blur = blur;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public Runnable animate(TextShadow to, Animation an) {
		return () -> {
			this.getBlur().animate(to.getBlur(), an).run();
			this.getColor().animate(to.getColor(), an).run();
			this.getLength().animate(to.getLength(), an).run();
			this.getWidth().animate(to.getWidth(), an).run();
		};
	}
}
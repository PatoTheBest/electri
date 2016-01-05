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
	
	public Size length() {
		return length;
	}
	
	public void length(Size length) {
		this.length = length;
	}
	
	public void length(double length) {
		this.length(new Size(length));
	}
	
	public Size width() {
		return width;
	}
	
	public void width(Size width) {
		this.width = width;
	}
	
	public Size blur() {
		return blur;
	}
	
	public void blur(Size blur) {
		this.blur = blur;
	}
	
	public Color color() {
		return color;
	}
	
	public void color(Color color) {
		this.color = color;
	}
	
	@Override
	public Runnable animate(TextShadow to, Animation an) {
		return () -> {
			this.blur().animate(to.blur(), an).run();
			this.color().animate(to.color(), an).run();
			this.length().animate(to.length(), an).run();
			this.width().animate(to.width(), an).run();
		};
	}

	@Override
	public String css() {
		return this.length() + " " + this.width() + " " + this.blur() + " " + this.color();
	}
}
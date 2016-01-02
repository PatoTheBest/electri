package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Color;
import net.prefixaut.deadalus.Size;

public class ColorBorder implements SingleBorder<ColorBorder>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000000BL;
	private Color color = Color.BLACK;
	private Size width = new Size(1);
	private BorderStyle style = BorderStyle.SOLID;
	
	public ColorBorder() {}
	
	public ColorBorder(Color color) {
		this.color = color;
	}
	
	public ColorBorder(Size width) {
		this.width = width;
	}
	
	public ColorBorder(BorderStyle style) {
		this.style = style;
	}
	
	public ColorBorder(Color color, Size width) {
		this.color = color;
		this.width = width;
	}
	
	public ColorBorder(Color color, BorderStyle style) {
		this.color = color;
		this.style = style;
	}
	
	public ColorBorder(Size width, Color color) {
		this.width = width;
		this.color = color;
	}
	
	public ColorBorder(Size width, BorderStyle style) {
		this.width = width;
		this.style = style;
	}
	
	public ColorBorder(BorderStyle style, Color color) {
		this.style = style;
		this.color = color;
	}
	
	public ColorBorder(BorderStyle style, Size width) {
		this.style = style;
		this.width = width;
	}
	
	public ColorBorder(Color color, Size width, BorderStyle style) {
		this.color = color;
		this.width = width;
		this.style = style;
	}
	
	public ColorBorder(Color color, BorderStyle style, Size width) {
		this.color = color;
		this.width = width;
		this.style = style;
	}
	
	public ColorBorder(Size width, Color color, BorderStyle style) {
		this.color = color;
		this.width = width;
		this.style = style;
	}
	
	public ColorBorder(Size width, BorderStyle style, Color color) {
		this.color = color;
		this.width = width;
		this.style = style;
	}
	
	public ColorBorder(BorderStyle style, Size width, Color color) {
		this.color = color;
		this.width = width;
		this.style = style;
	}
	
	public ColorBorder(BorderStyle style, Color color, Size width) {
		this.color = color;
		this.width = width;
		this.style = style;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Size getWidth() {
		return width;
	}
	
	public void setWidth(Size width) {
		this.width = width;
	}
	
	public BorderStyle getStyle() {
		return style;
	}
	
	public void setStyle(BorderStyle style) {
		this.style = style;
	}
	
	@Override
	public Runnable animate(ColorBorder to, Animation an) {
		return () -> {
			this.color.animate(to.getColor(), an).run();
			this.width.animate(to.getWidth(), an).run();
		};
	}
}
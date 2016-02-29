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
	
	public Color color() {
		return color;
	}
	
	public void color(Color color) {
		this.color = color;
	}
	
	@Override
	public Size width() {
		return width;
	}
	
	@Override
	public void width(Size width) {
		this.width = width;
	}
	
	public BorderStyle style() {
		return style;
	}
	
	public void style(BorderStyle style) {
		this.style = style;
	}
	
	@Override
	public Runnable animate(ColorBorder to, Animation an) {
		return () -> {
			this.color.animate(to.color(), an).run();
			this.width.animate(to.width(), an).run();
		};
	}

	@Override
	public String css() {
		return this.width() + " " + this.style() + " " + this.color();
	}
}
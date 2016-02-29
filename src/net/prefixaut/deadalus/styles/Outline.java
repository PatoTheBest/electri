package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Color;
import net.prefixaut.deadalus.Size;

public class Outline implements Style, Animatable<Outline>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000001AL;
	private byte defID = 0;
	private Color color = Color.INVERTED;
	private OutlineStyle style = OutlineStyle.NONE;
	private Size width = new Size(0);
	public static final Outline INHERIT = new Outline((byte) Byte.MAX_VALUE);
	
	private Outline(byte defID) {
		this.defID = defID;
	}
	
	public Outline(Color color) {
		this.color = color;
	}
	
	public Outline(OutlineStyle style) {
		this.style = style;
	}
	
	public Outline(double width) {
		this.width = new Size(width);
	}
	
	public Outline(Size width) {
		this.width = width;
	}
	
	public Outline(Color color, OutlineStyle style) {
		this.color = color;
		this.style = style;
	}
	
	public Outline(Color color, double width) {
		this.color = color;
		this.width = new Size(width);
	}
	
	public Outline(Color color, Size width) {
		this.color = color;
		this.width = width;
	}
	
	public Outline(Color color, OutlineStyle style, double width) {
		this.color = color;
		this.style = style;
		this.width = new Size(width);
	}
	
	public Outline(Color color, OutlineStyle style, Size width) {
		this.color = color;
		this.style = style;
		this.width = width;
	}
	
	public Outline(Color color, double width, OutlineStyle style) {
		this.color = color;
		this.style = style;
		this.width = new Size(width);
	}
	
	public Outline(Color color, Size width, OutlineStyle style) {
		this.color = color;
		this.style = style;
		this.width = width;
	}
	
	public Outline(double width, Color color) {
		this.color = color;
		this.width = new Size(width);
	}
	
	public Outline(Size width, Color color) {
		this.color = color;
		this.width = width;
	}
	
	public Outline(double width, OutlineStyle style) {
		this.width = new Size(width);
		this.style = style;
	}
	
	public Outline(Size width, OutlineStyle style) {
		this.width = width;
		this.style = style;
	}
	
	public Outline(OutlineStyle style, Color color) {
		this.color = color;
		this.style = style;
	}
	
	public Outline(OutlineStyle style, double width) {
		this.style = style;
		this.width = new Size(width);
	}
	
	public Outline(OutlineStyle style, Size width) {
		this.style = style;
		this.width = width;
	}
	
	public Outline(double width, Color color, OutlineStyle style) {
		this.width = new Size(width);
		this.color = color;
		this.style = style;
	}
	
	public Outline(Size width, Color color, OutlineStyle style) {
		this.width = width;
		this.color = color;
		this.style = style;
	}
	
	public Outline(double width, OutlineStyle style, Color color) {
		this.width = new Size(width);
		this.color = color;
		this.style = style;
	}
	
	public Outline(Size width, OutlineStyle style, Color color) {
		this.width = width;
		this.color = color;
		this.style = style;
	}
	
	public Outline(OutlineStyle style, Color color, double width) {
		this.width = new Size(width);
		this.color = color;
		this.style = style;
	}
	
	public Outline(OutlineStyle style, Color color, Size width) {
		this.width = width;
		this.color = color;
		this.style = style;
	}
	
	public Outline(OutlineStyle style, double width, Color color) {
		this.width = new Size(width);
		this.color = color;
		this.style = style;
	}
	
	public Outline(OutlineStyle style, Size width, Color color) {
		this.width = width;
		this.color = color;
		this.style = style;
	}
	
	public Color color() {
		return color;
	}
	
	public void color(Color color) {
		this.color = color;
	}
	
	public OutlineStyle style() {
		return style;
	}
	
	public void style(OutlineStyle style) {
		this.style = style;
	}
	
	public Size width() {
		return width;
	}
	
	public void width(Size width) {
		this.width = width;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (color == null) ? 0 : color.hashCode());
		result = prime * result + defID;
		result = prime * result + ( (style == null) ? 0 : style.hashCode());
		result = prime * result + ( (width == null) ? 0 : width.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Outline other = (Outline) obj;
		if (color == null) {
			if (other.color != null) return false;
		} else if (!color.equals(other.color)) return false;
		if (defID != other.defID) return false;
		if (style != other.style) return false;
		if (width == null) {
			if (other.width != null) return false;
		} else if (!width.equals(other.width)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(Outline to, Animation an) {
		return () -> {
			this.color().animate(to.color(), an).run();
			this.width().animate(to.width(), an).run();
		};
	}

	@Override
	public String css() {
		return this.color() + " " + this.style() + " " + this.width();
	}
}
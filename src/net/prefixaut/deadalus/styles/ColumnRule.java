package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Color;
import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.css.Style;

public class ColumnRule implements Style, Animatable<ColumnRule>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000000DL;
	private byte defID = 0;
	private boolean important = false;
	private Size width = new Size(0);
	private ColumnRuleStyle style = ColumnRuleStyle.NONE;
	private Color color = Color.BLACK;
	public static final ColumnRule INHERIT = new ColumnRule((byte) Byte.MAX_VALUE);
	
	private ColumnRule(byte defID) {
		this.defID = defID;
	}
	
	public ColumnRule(double width) {
		this.width = new Size(width);
	}
	
	public ColumnRule(Size width) {
		this.width = width;
	}
	
	public ColumnRule(double width, Color color) {
		this.width = new Size(width);
		this.color = color;
	}
	
	public ColumnRule(Size width, Color color) {
		this.width = width;
		this.color = color;
	}
	
	public ColumnRule(double width, ColumnRuleStyle style) {
		this.width = new Size(width);
		this.style = style;
	}
	
	public ColumnRule(Size width, ColumnRuleStyle style) {
		this.width = width;
		this.style = style;
	}
	
	public ColumnRule(double width, Color color, ColumnRuleStyle style) {
		this.width = new Size(width);
		this.color = color;
		this.style = style;
	}
	
	public ColumnRule(Size width, Color color, ColumnRuleStyle style) {
		this.width = width;
		this.color = color;
		this.style = style;
	}
	
	public Size width() {
		return width;
	}
	
	public void width(Size width) {
		this.width = width;
	}
	
	public ColumnRuleStyle style() {
		return style;
	}
	
	public void style(ColumnRuleStyle style) {
		this.style = style;
	}
	
	public Color color() {
		return color;
	}
	
	public void color(Color color) {
		this.color = color;
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
		ColumnRule other = (ColumnRule) obj;
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
	public Runnable animate(ColumnRule to, Animation an) {
		return () -> {
			this.color().animate(to.color(), an).run();
			this.width().animate(to.width(), an).run();
		};
	}
	
	@Override
	public String css() {
		return this.width() + " " + this.style() + " " + this.color();
	}
	
	@Override
	public boolean important() {
		return this.important;
	}
	
	@Override
	public void important(boolean important) {
		this.important = important;
	}
}
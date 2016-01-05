package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class CornerRadius implements Animatable<CornerRadius>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000000FL;
	private Size width = new Size(0), height = new Size(0);
	
	public CornerRadius() {}
	
	public CornerRadius(Size both) {
		this.width = both;
		this.height = both;
	}
	
	public CornerRadius(double both) {
		this.width = new Size(both);
		this.height = new Size(both);
	}
	
	public CornerRadius(Size width, Size height) {
		this.width = width;
		this.height = height;
	}
	
	public CornerRadius(double width, double height) {
		this.width = new Size(width);
		this.height = new Size(height);
	}
	
	public CornerRadius(Size width, double height) {
		this.width = width;
		this.height = new Size(height);
	}
	
	public CornerRadius(double width, Size height) {
		this.width = new Size(width);
		this.height = height;
	}
	
	public Size width() {
		return width;
	}
	
	public void width(double width) {
		this.width = new Size(width);
	}
	
	public void width(Size width) {
		this.width = width;
	}
	
	public Size height() {
		return height;
	}
	
	public void height(double height) {
		this.height = new Size(height);
	}
	
	public void height(Size height) {
		this.height = height;
	}
	
	@Override
	public Runnable animate(CornerRadius to, Animation an) {
		return () -> {
			this.height().animate(to.height(), an).run();
			this.width().animate(to.width(), an).run();
		};
	}
	
	@Override
	public String toString() {
		return this.width() + " " + this.height();
	}
}
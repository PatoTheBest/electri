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
	
	public Size getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = new Size(width);
	}
	
	public void setWidth(Size width) {
		this.width = width;
	}
	
	public Size getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = new Size(height);
	}
	
	public void setHeight(Size height) {
		this.height = height;
	}
	
	@Override
	public Runnable animate(CornerRadius to, Animation an) {
		return () -> {
			this.getHeight().animate(to.getHeight(), an).run();
			this.getWidth().animate(to.getWidth(), an).run();
		};
	}
}
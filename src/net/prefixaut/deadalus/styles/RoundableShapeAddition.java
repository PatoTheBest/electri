package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.Size;

public abstract class RoundableShapeAddition<T> extends ShapeAddition<T> {
	
	private static final long serialVersionUID = 0x1000200020000002L;
	private CornerRadius topLeft = new CornerRadius(),
			topRight = new CornerRadius(),
			bottomLeft = new CornerRadius(),
			bottomRight = new CornerRadius();
	
	public RoundableShapeAddition() {}
	
	public RoundableShapeAddition(T all) {
		super(all);
	}
	
	public RoundableShapeAddition(T vertical, T horizontal) {
		super(vertical, horizontal);
	}
	
	public RoundableShapeAddition(T top, T horizontal, T bottom) {
		super(top, horizontal, bottom);
	}
	
	public RoundableShapeAddition(T top, T right, T bottom, T left) {
		super(top, right, bottom, left);
	}
	
	public void setTopLeftRadius(CornerRadius radius) {
		this.topLeft = radius;
	}
	
	public void setTopLeftRadius(Size radius) {
		this.topLeft = new CornerRadius(radius);
	}
	
	public void setTopLeftRadius(double radius) {
		this.topLeft = new CornerRadius(radius);
	}
	
	public void setTopLeftRadius(Size width, Size height) {
		this.topLeft = new CornerRadius(width, height);
	}
	
	public void setTopLeftRadius(double width, double height) {
		this.topLeft = new CornerRadius(width, height);
	}
	
	public CornerRadius getTopLeftRadius() {
		return this.topLeft;
	}
	
	public void setTopRightRadius(CornerRadius radius) {
		this.topRight = radius;
	}
	
	public void setTopRightRadius(Size radius) {
		this.topRight = new CornerRadius(radius);
	}
	
	public void setTopRightRadius(double radius) {
		this.topRight = new CornerRadius(radius);
	}
	
	public void setTopRightRadius(Size width, Size height) {
		this.topRight = new CornerRadius(width, height);
	}
	
	public void setTopRightRadius(double width, double height) {
		this.topRight = new CornerRadius(width, height);
	}
	
	public CornerRadius getTopRightRadius() {
		return this.topRight;
	}
	
	public void setBottomLeftRadius(CornerRadius radius) {
		this.bottomLeft = radius;
	}
	
	public void setBottomLeftRadius(Size radius) {
		this.bottomLeft = new CornerRadius(radius);
	}
	
	public void setBottomLeftRadius(double radius) {
		this.bottomLeft = new CornerRadius(radius);
	}
	
	public void setBottomLeftRaius(Size width, Size height) {
		this.bottomLeft = new CornerRadius(width, height);
	}
	
	public void setBottomLeftRadius(double width, double height) {
		this.bottomLeft = new CornerRadius(width, height);
	}
	
	public CornerRadius getBottomLeftRadius() {
		return this.bottomLeft;
	}
	
	public void setBottomRightRadius(CornerRadius radius) {
		this.bottomRight = radius;
	}
	
	public void setBottomRightRadius(Size radius) {
		this.bottomRight = new CornerRadius(radius);
	}
	
	public void setBottomRightRadius(double radius) {
		this.bottomRight = new CornerRadius(radius);
	}
	
	public void setBottomRightRadius(Size width, Size height) {
		this.bottomRight = new CornerRadius(width, height);
	}
	
	public void setBottomRightRadius(double width, double height) {
		this.bottomRight = new CornerRadius(width, height);
	}
	
	public CornerRadius getBottomRightRadius() {
		return this.bottomRight;
	}
	
	public void setCorners(CornerRadius all) {
		this.topLeft = this.topRight = this.bottomLeft = this.bottomRight = all;
	}
	
	public void setCorners(Size all) {
		this.setCorners(new CornerRadius(all));
	}
	
	public void setCorners(double all) {
		this.setCorners(new CornerRadius(all));
	}
	
	public void setCorners(CornerRadius top, CornerRadius bottom) {
		this.setTopCorners(top);
		this.setBottomCorners(bottom);
	}
	
	public void setCorners(Size top, Size bottom) {
		this.setCorners(new CornerRadius(top), new CornerRadius(bottom));
	}
	
	public void setCorners(double top, double bottom) {
		this.setCorners(new CornerRadius(top), new CornerRadius(bottom));
	}
	
	public void setTopCorners(CornerRadius radius) {
		this.topLeft = this.topRight = radius;
	}
	
	public void setTopCorners(Size radius) {
		this.setTopCorners(new CornerRadius(radius));
	}
	
	public void setTopCorners(double radius) {
		this.setTopCorners(new CornerRadius(radius));
	}
	
	public void setTopCorners(Size width, Size height) {
		this.setTopCorners(new CornerRadius(width, height));
	}
	
	public void setTopCorners(double width, double height) {
		this.setTopCorners(new CornerRadius(width, height));
	}
	
	public void setRightCorners(CornerRadius radius) {
		this.topRight = this.bottomRight = radius;
	}
	
	public void setRightCorners(Size radius) {
		this.setRightCorners(new CornerRadius(radius));
	}
	
	public void setRightCorners(double radius) {
		this.setRightCorners(new CornerRadius(radius));
	}
	
	public void setRightCorners(Size width, Size height) {
		this.setRightCorners(new CornerRadius(width, height));
	}
	
	public void setRightCorners(double width, double height) {
		this.setRightCorners(new CornerRadius(width, height));
	}
	
	public void setBottomCorners(CornerRadius radius) {
		this.bottomLeft = this.bottomRight = radius;
	}
	
	public void setBottomCorners(Size radius) {
		this.setBottomCorners(new CornerRadius(radius));
	}
	
	public void setBottomCorners(double radius) {
		this.setBottomCorners(new CornerRadius(radius));
	}
	
	public void setBottomCorners(Size width, Size height) {
		this.setBottomCorners(new CornerRadius(width, height));
	}
	
	public void setBottomCorners(double width, double height) {
		this.setBottomCorners(new CornerRadius(width, height));
	}
	
	public void setLeftCorners(CornerRadius radius) {
		this.topLeft = this.bottomLeft = radius;
	}
	
	public void setLeftCorners(Size radius) {
		this.setLeftCorners(new CornerRadius(radius));
	}
	
	public void setLeftCorners(double radius) {
		this.setLeftCorners(new CornerRadius(radius));
	}
	
	public void setLeftCorners(Size width, Size height) {
		this.setLeftCorners(new CornerRadius(width, height));
	}
	
	public void setLeftCorners(double width, double height) {
		this.setLeftCorners(new CornerRadius(width, height));
	}
}
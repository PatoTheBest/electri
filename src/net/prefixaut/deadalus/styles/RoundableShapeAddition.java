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
	
	public void topLeft(CornerRadius radius) {
		this.topLeft = radius;
	}
	
	public void topLeft(Size radius) {
		this.topLeft = new CornerRadius(radius);
	}
	
	public void topLeft(double radius) {
		this.topLeft = new CornerRadius(radius);
	}
	
	public void topLeft(Size width, Size height) {
		this.topLeft = new CornerRadius(width, height);
	}
	
	public void topLeft(double width, double height) {
		this.topLeft = new CornerRadius(width, height);
	}
	
	public CornerRadius topLeft() {
		return this.topLeft;
	}
	
	public void topRight(CornerRadius radius) {
		this.topRight = radius;
	}
	
	public void topRight(Size radius) {
		this.topRight = new CornerRadius(radius);
	}
	
	public void topRight(double radius) {
		this.topRight = new CornerRadius(radius);
	}
	
	public void topRight(Size width, Size height) {
		this.topRight = new CornerRadius(width, height);
	}
	
	public void topRight(double width, double height) {
		this.topRight = new CornerRadius(width, height);
	}
	
	public CornerRadius topRight() {
		return this.topRight;
	}
	
	public void bottomLeft(CornerRadius radius) {
		this.bottomLeft = radius;
	}
	
	public void bottomLeft(Size radius) {
		this.bottomLeft = new CornerRadius(radius);
	}
	
	public void bottomLeft(double radius) {
		this.bottomLeft = new CornerRadius(radius);
	}
	
	public void bottomLeft(Size width, Size height) {
		this.bottomLeft = new CornerRadius(width, height);
	}
	
	public void bottomLeft(double width, double height) {
		this.bottomLeft = new CornerRadius(width, height);
	}
	
	public CornerRadius bottomLeft() {
		return this.bottomLeft;
	}
	
	public void bottomRight(CornerRadius radius) {
		this.bottomRight = radius;
	}
	
	public void bottomRight(Size radius) {
		this.bottomRight = new CornerRadius(radius);
	}
	
	public void bottomRight(double radius) {
		this.bottomRight = new CornerRadius(radius);
	}
	
	public void bottomRight(Size width, Size height) {
		this.bottomRight = new CornerRadius(width, height);
	}
	
	public void bottomRight(double width, double height) {
		this.bottomRight = new CornerRadius(width, height);
	}
	
	public CornerRadius bottomRight() {
		return this.bottomRight;
	}
	
	public void corners(CornerRadius all) {
		this.topLeft = this.topRight = this.bottomLeft = this.bottomRight = all;
	}
	
	public void corners(Size all) {
		this.corners(new CornerRadius(all));
	}
	
	public void corners(double all) {
		this.corners(new CornerRadius(all));
	}
	
	public void corners(CornerRadius top, CornerRadius bottom) {
		this.topCorners(top);
		this.bottomCorners(bottom);
	}
	
	public void corners(Size top, Size bottom) {
		this.corners(new CornerRadius(top), new CornerRadius(bottom));
	}
	
	public void corners(double top, double bottom) {
		this.corners(new CornerRadius(top), new CornerRadius(bottom));
	}
	
	public void topCorners(CornerRadius radius) {
		this.topLeft = this.topRight = radius;
	}
	
	public void topCorners(Size radius) {
		this.topCorners(new CornerRadius(radius));
	}
	
	public void topCorners(double radius) {
		this.topCorners(new CornerRadius(radius));
	}
	
	public void topCorners(Size width, Size height) {
		this.topCorners(new CornerRadius(width, height));
	}
	
	public void topCorners(double width, double height) {
		this.topCorners(new CornerRadius(width, height));
	}
	
	public void rightCorners(CornerRadius radius) {
		this.topRight = this.bottomRight = radius;
	}
	
	public void rightCorners(Size radius) {
		this.rightCorners(new CornerRadius(radius));
	}
	
	public void rightCorners(double radius) {
		this.rightCorners(new CornerRadius(radius));
	}
	
	public void rightCorners(Size width, Size height) {
		this.rightCorners(new CornerRadius(width, height));
	}
	
	public void rightCorners(double width, double height) {
		this.rightCorners(new CornerRadius(width, height));
	}
	
	public void bottomCorners(CornerRadius radius) {
		this.bottomLeft = this.bottomRight = radius;
	}
	
	public void bottomCorners(Size radius) {
		this.bottomCorners(new CornerRadius(radius));
	}
	
	public void bottomCorners(double radius) {
		this.bottomCorners(new CornerRadius(radius));
	}
	
	public void bottomCorners(Size width, Size height) {
		this.bottomCorners(new CornerRadius(width, height));
	}
	
	public void bottomCorners(double width, double height) {
		this.bottomCorners(new CornerRadius(width, height));
	}
	
	public void leftCorners(CornerRadius radius) {
		this.topLeft = this.bottomLeft = radius;
	}
	
	public void leftCorners(Size radius) {
		this.leftCorners(new CornerRadius(radius));
	}
	
	public void leftCorners(double radius) {
		this.leftCorners(new CornerRadius(radius));
	}
	
	public void leftCorners(Size width, Size height) {
		this.leftCorners(new CornerRadius(width, height));
	}
	
	public void leftCorners(double width, double height) {
		this.leftCorners(new CornerRadius(width, height));
	}
}
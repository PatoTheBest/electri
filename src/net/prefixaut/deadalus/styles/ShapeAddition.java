package net.prefixaut.deadalus.styles;

import java.io.Serializable;

public abstract class ShapeAddition<T> implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000001L;
	private T top, right, bottom, left;
	
	public ShapeAddition() {}
	
	public ShapeAddition(T all) {
		this.set(all);
	}
	
	public ShapeAddition(T vertical, T horizontal) {
		this.set(vertical, horizontal);
	}
	
	public ShapeAddition(T top, T horizontal, T bottom) {
		this.set(top, horizontal, bottom);
	}
	
	public ShapeAddition(T top, T right, T bottom, T left) {
		this.set(top, right, bottom, left);
	}
	
	public void set(T all) {
		this.top = this.right = this.bottom = this.left = all;
	}
	
	public void set(T vertical, T horizontal) {
		this.top = this.bottom = vertical;
		this.right = this.left = horizontal;
	}
	
	public void set(T top, T horizontal, T bottom) {
		this.top = top;
		this.right = this.left = horizontal;
		this.bottom = bottom;
	}
	
	public void set(T top, T right, T bottom, T left) {
		this.top = top;
		this.right = right;
		this.bottom = bottom;
		this.left = left;
	}
	
	public T getTop() {
		return top;
	}
	
	public void setTop(T top) {
		this.top = top;
	}
	
	public T getRight() {
		return right;
	}
	
	public void setRight(T right) {
		this.right = right;
	}
	
	public T getBottom() {
		return bottom;
	}
	
	public void setBottom(T bottom) {
		this.bottom = bottom;
	}
	
	public T getLeft() {
		return left;
	}
	
	public void setLeft(T left) {
		this.left = left;
	}
	
	@Override
	public String toString() {
		return "BoxAddition {top=" + top + ", right=" + right + ", bottom="
				+ bottom + ", left=" + left + "}";
	}
}

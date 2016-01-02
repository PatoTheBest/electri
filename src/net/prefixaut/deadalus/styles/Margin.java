package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class Margin extends AnimatableShapeAddition<Size> implements Serializable {
	
	private static final long serialVersionUID = 0x1000200020000018L;

	public Margin() {
		super(new Size(0));
	}
	
	public Margin(Size all) {
		super(all);
	}
	
	public Margin(Size vertical, Size horizontal) {
		super(vertical, horizontal);
	}
	
	public Margin(Size top, Size horizontal, Size bottom) {
		super(top, horizontal, bottom);
	}
	
	public Margin(Size top, Size right, Size bottom, Size left) {
		super(top, right, bottom, left);
	}
	
	public void setTop(double top) {
		super.setTop(new Size(top));
	}
	
	public void setRight(double right) {
		super.setRight(new Size(right));
	}
	
	public void setBottom(double bottom) {
		super.setBottom(new Size(bottom));
	}
	
	public void setLeft(double left) {
		super.setLeft(new Size(left));
	}
}
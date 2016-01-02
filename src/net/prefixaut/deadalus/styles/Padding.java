package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class Padding extends AnimatableShapeAddition<Size> implements Serializable {
	
	private static final long serialVersionUID = 0x100020002000001BL;

	public Padding() {
		super(new Size(0));
	}
	
	public Padding(Size all) {
		super(all);
	}
	
	public Padding(Size vertical, Size horizontal) {
		super(vertical, horizontal);
	}
	
	public Padding(Size top, Size horizontal, Size bottom) {
		super(top, horizontal, bottom);
	}
	
	public Padding(Size top, Size right, Size bottom, Size left) {
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
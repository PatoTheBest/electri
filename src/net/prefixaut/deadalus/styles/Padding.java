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
	
	public void top(double top) {
		super.top(new Size(top));
	}
	
	public void right(double right) {
		super.right(new Size(right));
	}
	
	public void bottom(double bottom) {
		super.bottom(new Size(bottom));
	}
	
	public void left(double left) {
		super.left(new Size(left));
	}
}
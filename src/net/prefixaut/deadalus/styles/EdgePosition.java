package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.Size;

public class EdgePosition extends AnimatableShapeAddition<Size> {
	
	private static final long serialVersionUID = 0x1000200020000010L;

	public EdgePosition() {
		super(Size.AUTO);
	}
	
	public EdgePosition(Size all) {
		super(all);
	}
	
	public EdgePosition(Size vertical, Size horizontal) {
		super(vertical, horizontal);
	}
	
	public EdgePosition(Size top, Size horizontal, Size bottom) {
		super(top, horizontal, bottom);
	}
	
	public EdgePosition(Size top, Size right, Size bottom, Size left) {
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
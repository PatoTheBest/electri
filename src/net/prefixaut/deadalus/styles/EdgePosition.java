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
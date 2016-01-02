package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.styles.Margin;

public interface MarginSupport {
	
	public void setMargin(Margin padding);
	
	public Margin getMargin();
	
	public default void setMarginTop(Size size) {
		Margin m = this.getMargin();
		m.setTop(size);
		this.setMargin(m);
	}
	
	public default void setMarginTop(double size) {
		this.setMarginTop(new Size(size));
	}
	
	public default Size getMarginTop() {
		return this.getMargin().getTop();
	}
	
	public default void setMarginRight(Size size) {
		Margin m = this.getMargin();
		m.setRight(size);
		this.setMargin(m);
	}
	
	public default void setMarginRight(double size) {
		this.setMarginRight(new Size(size));
	}
	
	public default Size getMarginRight() {
		return this.getMargin().getRight();
	}
	
	public default void setMarginBottom(Size size) {
		Margin m = this.getMargin();
		m.setBottom(size);
		this.setMargin(m);
	}
	
	public default void setMarginBottom(double size) {
		this.setMarginBottom(new Size(size));
	}
	
	public default Size getMarginBottom() {
		return this.getMargin().getBottom();
	}
	
	public default void setMarginLeft(Size size) {
		Margin m = this.getMargin();
		m.setLeft(size);
		this.setMargin(m);
	}
	
	public default void setMarginLeft(double size) {
		this.setMarginLeft(new Size(size));
	}
	
	public default Size getMarginLeft() {
		return this.getMargin().getLeft();
	}
}
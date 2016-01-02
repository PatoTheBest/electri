package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.styles.Padding;

public interface PaddingSupport {
	
	public void setPadding(Padding padding);
	
	public Padding getPadding();
	
	public default void setPaddingTop(Size size) {
		Padding p = this.getPadding();
		p.setTop(size);
		this.setPadding(p);
	}
	
	public default void setPaddingTop(double size) {
		this.setPaddingTop(new Size(size));
	}
	
	public default Size getPaddingTop() {
		return this.getPadding().getTop();
	}
	
	public default void setPaddingRight(Size size) {
		Padding p = this.getPadding();
		p.setRight(size);
		this.setPadding(p);
	}
	
	public default void setPaddingRight(double size) {
		this.setPaddingRight(new Size(size));
	}
	
	public default Size getPaddingRight() {
		return this.getPadding().getRight();
	}
	
	public default void setPaddingBottop(Size size) {
		Padding p = this.getPadding();
		p.setBottom(size);
		this.setPadding(p);
	}
	
	public default void setPaddingBottop(double size) {
		this.setPaddingBottop(new Size(size));
	}
	
	public default Size getPaddingBottop() {
		return this.getPadding().getBottom();
	}
	
	public default void setPaddingLeft(Size size) {
		Padding p = this.getPadding();
		p.setLeft(size);
		this.setPadding(p);
	}
	
	public default void setPaddingLeft(double size) {
		this.setPaddingLeft(new Size(size));
	}
	
	public default Size getPaddingLeft() {
		return this.getPadding().getLeft();
	}
}
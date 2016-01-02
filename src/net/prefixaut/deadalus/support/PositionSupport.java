package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.styles.EdgePosition;

public interface PositionSupport {
	
	public void setPosition(EdgePosition padding);
	
	public EdgePosition getPosition();
	
	public default void setPositionTop(Size size) {
		EdgePosition p = this.getPosition();
		p.setTop(size);
		this.setPosition(p);
	}
	
	public default void setPositionTop(double size) {
		this.setPositionTop(new Size(size));
	}
	
	public default Size getPositionTop() {
		return this.getPosition().getTop();
	}
	
	public default void setPositionRight(Size size) {
		EdgePosition p = this.getPosition();
		p.setRight(size);
		this.setPosition(p);
	}
	
	public default void setPositionRight(double size) {
		this.setPositionRight(new Size(size));
	}
	
	public default Size getPositionRight() {
		return this.getPosition().getRight();
	}
	
	public default void setPositionBottop(Size size) {
		EdgePosition p = this.getPosition();
		p.setBottom(size);
		this.setPosition(p);
	}
	
	public default void setPositionBottop(double size) {
		this.setPositionBottop(new Size(size));
	}
	
	public default Size getPositionBottop() {
		return this.getPosition().getBottom();
	}
	
	public default void setPositionLeft(Size size) {
		EdgePosition p = this.getPosition();
		p.setLeft(size);
		this.setPosition(p);
	}
	
	public default void setPositionLeft(double size) {
		this.setPositionLeft(new Size(size));
	}
	
	public default Size getPositionLeft() {
		return this.getPosition().getLeft();
	}
}
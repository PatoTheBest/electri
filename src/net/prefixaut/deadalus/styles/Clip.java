package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.geometry.Shape;

public class Clip implements Style, Animatable<Clip> {
	
	private Shape shape;
	
	private Clip() {}
	
	public Clip(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape;
	}
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public static final Clip AUTO = new Clip();
	
	@Override
	public Runnable animate(Clip to, Animation an) {
		return () -> {
			this.getShape().animate(to.getShape(), an).run();
		};
	}
}
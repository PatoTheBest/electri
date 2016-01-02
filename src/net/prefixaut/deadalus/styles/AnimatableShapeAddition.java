package net.prefixaut.deadalus.styles;

public abstract class AnimatableShapeAddition<T extends Animatable<T>> extends ShapeAddition<T> implements Animatable<AnimatableShapeAddition<T>> {
	
	private static final long serialVersionUID = 0x1000200020000003L;
	
	public AnimatableShapeAddition() {
		super();
	}
	
	public AnimatableShapeAddition(T top, T right, T bottom, T left) {
		super(top, right, bottom, left);
	}
	
	public AnimatableShapeAddition(T top, T horizontal, T bottom) {
		super(top, horizontal, bottom);
	}
	
	public AnimatableShapeAddition(T vertical, T horizontal) {
		super(vertical, horizontal);
	}
	
	public AnimatableShapeAddition(T all) {
		super(all);
	}
	
	@Override
	public Runnable animate(AnimatableShapeAddition<T> to, Animation an) {
		return () -> {
			this.getTop().animate(to.getTop(), an).run();
			this.getRight().animate(to.getRight(), an).run();
			this.getBottom().animate(to.getBottom(), an).run();
			this.getLeft().animate(to.getLeft(), an).run();
		};
	}
}
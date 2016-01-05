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
			this.top().animate(to.top(), an).run();
			this.right().animate(to.right(), an).run();
			this.bottom().animate(to.bottom(), an).run();
			this.left().animate(to.left(), an).run();
		};
	}
}
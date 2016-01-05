package net.prefixaut.deadalus.styles;

@SuppressWarnings("rawtypes")
public abstract class AnimateableRoundableShapeAddition<T extends Animatable> extends RoundableShapeAddition<T> implements Animatable<AnimateableRoundableShapeAddition<T>> {
	
	private static final long serialVersionUID = 0x1000200020000004L;

	public AnimateableRoundableShapeAddition() {
		super();
	}
	
	public AnimateableRoundableShapeAddition(T top, T right, T bottom, T left) {
		super(top, right, bottom, left);
	}
	
	public AnimateableRoundableShapeAddition(T top, T horizontal, T bottom) {
		super(top, horizontal, bottom);
	}
	
	public AnimateableRoundableShapeAddition(T vertical, T horizontal) {
		super(vertical, horizontal);
	}
	
	public AnimateableRoundableShapeAddition(T all) {
		super(all);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Runnable animate(AnimateableRoundableShapeAddition<T> to, Animation an) {
		return () -> {
			this.top().animate(to.top(), an).run();
			this.right().animate(to.right(), an).run();
			this.bottom().animate(to.bottom(), an).run();
			this.left().animate(to.left(), an).run();
			this.topRight().animate(to.topRight(), an).run();
			this.bottomRight().animate(to.bottomRight(), an).run();
			this.bottomLeft().animate(to.bottomLeft(), an).run();
			this.topLeft().animate(to.topLeft(), an).run();
		};
	}
}
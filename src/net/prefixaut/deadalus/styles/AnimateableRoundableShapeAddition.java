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
			this.getTop().animate(to.getTop(), an).run();
			this.getRight().animate(to.getRight(), an).run();
			this.getBottom().animate(to.getBottom(), an).run();
			this.getLeft().animate(to.getLeft(), an).run();
			this.getTopRightRadius().animate(to.getTopRightRadius(), an).run();
			this.getBottomRightRadius().animate(to.getBottomRightRadius(), an).run();
			this.getBottomLeftRadius().animate(to.getBottomLeftRadius(), an).run();
			this.getTopLeftRadius().animate(to.getTopLeftRadius(), an).run();
		};
	}
}
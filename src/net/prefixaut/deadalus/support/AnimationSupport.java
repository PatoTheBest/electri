package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.styles.Animation;
import net.prefixaut.deadalus.styles.AnimationDirection;
import net.prefixaut.deadalus.styles.AnimationFillMode;
import net.prefixaut.deadalus.styles.AnimationPlayState;
import net.prefixaut.deadalus.styles.AnimationTiming;

public interface AnimationSupport {
	
	public void setAnimation(Animation animation);
	
	public Animation getAnimation();
	
	public default void setAnimationDuration(long duration) {
		Animation a = this.getAnimation();
		a.setDuration(duration);
		this.setAnimation(a);
	}
	
	public default long getAnimationDuration() {
		return this.getAnimation().getDuration();
	}
	
	public default void setAnimatonDelay(long delay) {
		Animation a = this.getAnimation();
		a.setDelay(delay);
		this.setAnimation(a);
	}
	
	public default long getAnimationDelay() {
		return this.getAnimation().getDelay();
	}
	
	public default void setAnimationTiming(AnimationTiming timing) {
		Animation a = this.getAnimation();
		a.setTiming(timing);
		this.setAnimation(a);
	}
	
	public default AnimationTiming getAnimationTiming() {
		return this.getAnimation().getTiming();
	}
	
	public default void setAnimationIterations(int iterations) {
		Animation a = this.getAnimation();
		a.setIteration(iterations);
		this.setAnimation(a);
	}
	
	public default int getAnimationIterations() {
		return this.getAnimation().getIteration();
	}
	
	public default void setAnimationDirection(AnimationDirection direction) {
		Animation a = this.getAnimation();
		a.setDirection(direction);
		this.setAnimation(a);
	}
	
	public default AnimationDirection getAnimationDirection() {
		return this.getAnimation().getDirection();
	}
	
	public default void setAnimationFillMode(AnimationFillMode mode) {
		Animation a = this.getAnimation();
		a.setMode(mode);
		this.setAnimation(a);
	}
	
	public default AnimationFillMode getAnimationFillMode() {
		return this.getAnimation().getMode();
	}
	
	public default void setAnimationPlayState(AnimationPlayState playState) {
		Animation a = this.getAnimation();
		a.setState(playState);
		this.setAnimation(a);
	}
	
	public default AnimationPlayState getAnimationPlayState() {
		return this.getAnimation().getState();
	}
}
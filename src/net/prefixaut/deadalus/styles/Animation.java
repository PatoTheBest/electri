package net.prefixaut.deadalus.styles;

import java.io.Serializable;

public class Animation implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000005L;
	private byte defID = 0;
	private String name = "none";
	/**
	 * Time in Milliseconds
	 */
	private long duration = 0, delay = 0;
	private String timingData = null;
	private AnimationTiming timing; // TODO: Default -> EASE
	private double fps = 60;
	/**
	 * Negative = Infinite
	 */
	private int iteration = 1;
	private AnimationDirection direction = AnimationDirection.NORMAL;
	private AnimationFillMode mode = AnimationFillMode.NONE;
	private AnimationPlayState state = AnimationPlayState.RUNNING;
	public static final Animation INHERIT = new Animation((byte) Byte.MAX_VALUE);
	
	private Animation(byte defID) {
		this.defID = defID;
	}
	
	public Animation(String name) {
		this.name = name;
	}
	
	public Animation(String name, long duration) {
		this.name = name;
		this.duration = duration;
	}
	
	public Animation(String name, long duration, long delay) {
		this.name = name;
		this.duration = duration;
		this.delay = delay;
	}
	
	public Animation(String name, long duration, AnimationDirection direction) {
		this.name = name;
		this.duration = duration;
		this.direction = direction;
	}
	
	public Animation(String name, long duration, AnimationFillMode mode) {
		this.name = name;
		this.duration = duration;
		this.mode = mode;
	}
	
	public Animation(String name, long duration, AnimationPlayState state) {
		this.name = name;
		this.duration = duration;
		this.state = state;
	}
	
	public Animation(String name, long duration, long delay, AnimationDirection direction) {
		this.name = name;
		this.duration = duration;
		this.delay = delay;
		this.direction = direction;
	}
	
	public Animation(String name, long duration, long delay, AnimationFillMode mode) {
		this.name = name;
		this.duration = duration;
		this.delay = delay;
		this.mode = mode;
	}
	
	public Animation(String name, long duration, long delay, AnimationPlayState state) {
		this.name = name;
		this.duration = duration;
		this.delay = delay;
		this.state = state;
	}
	
	public Animation(String name, long duration, long delay, AnimationDirection direction, AnimationFillMode mode) {
		this.name = name;
		this.duration = duration;
		this.delay = delay;
		this.direction = direction;
		this.mode = mode;
	}
	
	public Animation(String name, long duration, long delay, AnimationTiming timing, int iteration, AnimationDirection direction, AnimationFillMode mode, AnimationPlayState state) {
		this.name = name;
		this.duration = duration;
		this.delay = delay;
		this.timing = timing;
		this.iteration = iteration;
		this.direction = direction;
		this.mode = mode;
		this.state = state;
	}
	
	public Animation(String name, long duration, long delay, AnimationTiming timing, int iteration, AnimationDirection direction, AnimationFillMode mode, AnimationPlayState state,
			double fps) {
		this.name = name;
		this.duration = duration;
		this.delay = delay;
		this.timing = timing;
		this.iteration = iteration;
		this.direction = direction;
		this.mode = mode;
		this.state = state;
		this.fps = fps;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getDuration() {
		return duration;
	}
	
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
	public long getDelay() {
		return delay;
	}
	
	public void setDelay(long delay) {
		this.delay = delay;
	}
	
	public AnimationTiming getTiming() {
		return timing;
	}
	
	public void setTiming(AnimationTiming timing) {
		this.timing = timing;
	}
	
	public String getTimingData() {
		return timingData;
	}
	
	public void setTimingData(String timingData) {
		this.timingData = timingData;
	}
	
	public int getIteration() {
		return iteration;
	}
	
	public void setIteration(int iteration) {
		this.iteration = iteration;
	}
	
	public AnimationDirection getDirection() {
		return direction;
	}
	
	public void setDirection(AnimationDirection direction) {
		this.direction = direction;
	}
	
	public AnimationFillMode getMode() {
		return mode;
	}
	
	public void setMode(AnimationFillMode mode) {
		this.mode = mode;
	}
	
	public AnimationPlayState getState() {
		return state;
	}
	
	public void setState(AnimationPlayState state) {
		this.state = state;
	}
	
	public double getFPS() {
		return fps;
	}
	
	public void setFPS(double fps) {
		this.fps = fps;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + (int) (delay ^ (delay >>> 32));
		result = prime * result + ( (direction == null) ? 0 : direction.hashCode());
		result = prime * result + (int) (duration ^ (duration >>> 32));
		long temp;
		temp = Double.doubleToLongBits(fps);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + iteration;
		result = prime * result + ( (mode == null) ? 0 : mode.hashCode());
		result = prime * result + ( (name == null) ? 0 : name.hashCode());
		result = prime * result + ( (state == null) ? 0 : state.hashCode());
		result = prime * result + ( (timing == null) ? 0 : timing.hashCode());
		result = prime * result + ( (timingData == null) ? 0 : timingData.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Animation other = (Animation) obj;
		if (defID != other.defID) return false;
		if (delay != other.delay) return false;
		if (direction != other.direction) return false;
		if (duration != other.duration) return false;
		if (Double.doubleToLongBits(fps) != Double.doubleToLongBits(other.fps)) return false;
		if (iteration != other.iteration) return false;
		if (mode != other.mode) return false;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		if (state != other.state) return false;
		if (timing == null) {
			if (other.timing != null) return false;
		} else if (!timing.equals(other.timing)) return false;
		if (timingData == null) {
			if (other.timingData != null) return false;
		} else if (!timingData.equals(other.timingData)) return false;
		return true;
	}
}
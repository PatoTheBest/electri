package net.prefixaut.deadalus.styles;

import java.io.Serializable;
import java.util.Collection;

import net.prefixaut.prelib.SyncArrayList;

public class Transition implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000025L;
	private SyncArrayList<Class<? extends Style>> properties;
	/**
	 * Time in Milliseconds
	 */
	private long duration = 0, delay = 0;
	private TransitionTiming timing = TransitionTiming.EASE;
	
	public Transition() {}
	
	@SafeVarargs
	public Transition(Class<? extends Style>... props) {
		this.properties = new SyncArrayList<>(props);
	}
	
	public Transition(Collection<Class<? extends Style>> properties) {
		this.properties = new SyncArrayList<>(properties);
	}
	
	public Transition(long duration) {
		this.duration = duration;
	}
	
	public Transition(TransitionTiming timing) {
		this.timing = timing;
	}
	
	public Transition(long duration, long delay) {
		this.duration = duration;
		this.delay = delay;
	}
	
	public Transition(long duration, TransitionTiming timing) {
		this.duration = duration;
		this.timing = timing;
	}
	
	public Transition(long duration, Collection<Class<? extends Style>> properties) {
		this.properties = new SyncArrayList<>(properties);
		this.duration = duration;
	}
	
	@SafeVarargs
	public Transition(long duration, Class<? extends Style>... props) {
		this.duration = duration;
		this.properties = new SyncArrayList<>(props);
	}
	
	public Transition(Collection<Class<? extends Style>> properties, TransitionTiming timing) {
		this.properties = new SyncArrayList<>(properties);
		this.timing = timing;
	}
	
	public Transition(TransitionTiming timing, Collection<Class<? extends Style>> properties) {
		this.timing = timing;
		this.properties = new SyncArrayList<>(properties);
	}
	
	@SafeVarargs
	public Transition(TransitionTiming timing, Class<? extends Style>... properties) {
		this.timing = timing;
		this.properties = new SyncArrayList<>(properties);
	}
	
	public boolean addProperty(Class<? extends Style> prop) {
		return this.properties.add(prop);
	}
	
	public boolean removeProperty(Class<? extends Style> prop) {
		return this.properties.remove(prop);
	}
	
	public SyncArrayList<Class<? extends Style>> getProperties() {
		return properties;
	}
	
	public void setProperties(SyncArrayList<Class<? extends Style>> properties) {
		this.properties = properties;
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
	
	public TransitionTiming getTiming() {
		return timing;
	}
	
	public void setTiming(TransitionTiming timing) {
		this.timing = timing;
	}
}
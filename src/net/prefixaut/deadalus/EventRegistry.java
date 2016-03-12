package net.prefixaut.deadalus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.prefixaut.deadalus.event.Event;
import net.prefixaut.deadalus.event.Listener;

public class EventRegistry {
	
	private Map<Class<Event>, List<Listener<?>>> listeners = new HashMap<>();
	
	protected EventRegistry() {}
	
	/*
	 * Ignore able since E is an Event, casting it to an Event won't make problems.
	 */
	@SuppressWarnings("unchecked")
	public <E extends Event> boolean register(Class<E> eventClass, Listener<E> listener) {
		if (eventClass == null) throw new IllegalArgumentException("NULL is an invalid Class!");
		if (listener == null) throw new IllegalArgumentException("NULL is an invalid Listener!");
		List<Listener<?>> li = this.listeners.get(eventClass);
		if (li == null) li = new ArrayList<>();
		boolean r = li.add(listener);
		this.listeners.put((Class<Event>) eventClass, li);
		return r;
	}
	
	/*
	 * Ignore able since E is an Event, casting it to an Event won't make problems.
	 */
	@SuppressWarnings("unchecked")
	public <E extends Event> boolean unregister(Class<E> eventClass, Listener<E> listener) {
		if (eventClass == null) throw new IllegalArgumentException("NULL is an invalid Class!");
		if (listener == null) throw new IllegalArgumentException("NULL is an invalid Listener!");
		List<Listener<?>> li = this.listeners.get(eventClass);
		if (li == null) return false;
		li.remove(listener);
		this.listeners.put((Class<Event>) eventClass, li);
		return true;
	}
	
	public <E extends Event> boolean fire(E event) {
		if (event == null) throw new IllegalArgumentException("NULL is an invalid Event!");
		List<Listener<?>> list = this.listeners.get(event.getClass());
		if (list == null || list.isEmpty()) return false;
		boolean r = true;
		for (Listener<?> li : list) {
			/*
			 * Checked since only Listener<E> will be able to be put into the List (see #register())
			 */
			@SuppressWarnings("unchecked")
			Listener<E> l = (Listener<E>) li;
			if (event.cancelled() && !l.triggerWhenCanceled()) {
				r = false;
				continue;
			}
			l.onEvent(event);
		}
		return r;
	}
}
package net.prefixaut.deadalus.event;

public interface Listener<E extends Event> {
	
	public void onEvent(E event);
	
	public default boolean triggerWhenCanceled() {
		return false;
	}
}
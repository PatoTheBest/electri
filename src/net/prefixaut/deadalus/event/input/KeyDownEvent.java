package net.prefixaut.deadalus.event.input;

import net.prefixaut.deadalus.Key;
import net.prefixaut.deadalus.event.Event;

public class KeyDownEvent implements Event {
	
	private Key key;
	private char character;
	private boolean cancel = false;
	
	public KeyDownEvent(Key key) {
		this.key = key;
		if (key.hasCharacter()) this.character = key.getCharacter();
	}
	
	public KeyDownEvent(char character) {
		this.character = character;
		this.key = Key.fromCharacter(character);
	}
	
	public Key key() {
		return this.key;
	}
	
	public char character() {
		return this.character;
	}
	
	@Override
	public boolean cancelled() {
		return this.cancel;
	}
	
	@Override
	public void cancelled(boolean cancel) {
		this.cancel = cancel;
	}
}
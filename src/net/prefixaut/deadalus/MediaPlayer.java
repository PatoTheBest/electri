package net.prefixaut.deadalus;

public interface MediaPlayer<T extends PlayMedia> {
	
	/**
	 * Current time of the Media in Milliseconds.
	 */
	public long time();
	
	/**
	 * Sets the time of the Media to a certain time. Time has to be set in Milliseconds.
	 */
	public void time(long time);
	
	/**
	 * Gets the current played Media.
	 */
	public T current();
	
	/**
	 * Gets the next Media in the List.
	 */
	public T next();
	
	/**
	 * Gets the previously played Media.
	 */
	public T previous();
	
	/**
	 * Attempts to skip to the next Media if possible.
	 * @return True if it succeeded; False otherwise
	 */
	public boolean toNext();
	
	/**
	 * Attempts to go back to the previous Media if possible.
	 * @return True if it succeeded; False otherwise
	 */
	public boolean toPrevious();
	
	/**
	 * If the Media is currently running
	 */
	public boolean playing();
	
	/**
	 * Attempts to play the Media
	 * 
	 * @return <b>true</b> if it succeeded; <b>false</b> otherwise
	 */
	public boolean play();
	
	/**
	 * Attempts to pause (hold it, so it can be continued later) the Media.
	 * 
	 * @return <b>true</b> if it succeeded; <b>false</b> otherwise
	 */
	public boolean pause();
	
	/**
	 * Attempts to stop the Media (Sets time back to 0 and basically resets the Media)
	 * 
	 * @return <b>true</b> if it succeeded; <b>false</b> otherwise
	 */
	public default boolean stop() {
		// Already stopped/at 0
		if (!this.playing() && this.time() == 0) return false;
		// Pause the Media, otherwise it'd start to play when we set the time to 0
		if (this.playing()) this.pause();
		// Reset the time
		this.time(0);
		return true;
	}
}
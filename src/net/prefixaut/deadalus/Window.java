package net.prefixaut.deadalus;

import net.prefixaut.deadalus.styles.Opacity;

public class Window {
	
	/**
	 * Document which Contains all Items/Data of the Window
	 */
	private PILLDocument document;
	/**
	 * Title of the Window - Will be displayed when the Border is enabled.
	 */
	private String title = "";
	/**
	 * Icon of the Window - Will be displayed when the Border is enabled. Will also be shown on the Taskbar in the OS (if supported)
	 */
	private Image icon = null;
	/**
	 * Parent-Window of this Window. For example if this is a Pop-Up Window, the normal window would be it's parent.
	 */
	private Window parent = null;
	/**
	 * Determines if the Window is locked.
	 * When a Window is locked and User attempts to access/use the Window, nothing will happen.
	 * There'll also be no Events for any (Direct) Inputs (Global Inputs still trigger).
	 */
	private boolean locked = false;
	/**
	 * Determines if the System/OS-Border should be displayed on the Window.
	 */
	private boolean border = true;
	/**
	 * Determines if the Window can be minimized. If false, it will lock/disable the minimize-button on the System/OS-Border.
	 */
	private boolean minimizeable = true;
	/**
	 * Determines if the Window can be maximized. An Maximized Window is NOT the same as Full-Screen Window! If false, it will lock/disable the maximize-button on the
	 * System/OS-Border.
	 */
	private boolean maximizeable = true;
	/**
	 * Determines if the Window can be used in Full-Screen.
	 */
	private boolean fullscreenable = true;
	/**
	 * Determines if the Window is close-able. If false, it will lock/disable the close-button on the System/OS-Border.
	 */
	private boolean closeable = true;
	/**
	 * Determines if the Window got closed. Once a Window is closed, it cannot be opened again
	 */
	private boolean closed = false;
	/**
	 * Determines if the Window is minimized.
	 */
	private boolean minimized = true;
	/**
	 * Determines if the Window is maximized.
	 */
	private boolean maximaized = false;
	/**
	 * Determines if the Window is in Full-Screen or not.
	 */
	private boolean fullscreen = false;
	/**
	 * Determines if the Window is always on top/cannot be overlapped by other Windows.
	 */
	private boolean alwaysOnTop = false;
	/**
	 * Determines if the Window is vertically resize-able.
	 */
	private boolean verticalResizeable = true;
	/**
	 * Determines if the Window is horizontally resize-able.
	 */
	private boolean horizontalResizeable = true;
	/**
	 * X and Y-Coordinate of the Window on the Screen. The Position is the very top-left corner/pixel of the Window.
	 */
	private int x = 0, y = 0;
	/**
	 * Width and Height of the Window on the Screen.
	 */
	private int width = 0, height = 0;
	/**
	 * Opacity-Level of the Window. Range: 0-100 (%)
	 */
	private Opacity opacity = new Opacity(100.0D);
	private EventRegistry eventReg = new EventRegistry();
	
	/**
	 * Function to force the Window to close
	 */
	public void shutdown() {}
	
	public void close() {
		if (this.closed || !this.closeable) return;
		// TODO:
	}
	
	public boolean closed() {
		return this.closed;
	}
	
	public void minimize() {
		if (this.minimized || !this.minimizeable) return;
		// TODO:
	}
	
	public void maximize() {
		if (this.maximaized || !this.maximizeable) return;
		// TODO:
	}
	
	public void fullscreen() {
		if (this.fullscreen || !this.fullscreenable) return;
		// TODO:
	}
	
	public boolean inFullscreen() {
		return this.fullscreen;
	}
	
	public String title() {
		return this.title;
	}
	
	public Image icon() {
		return this.icon;
	}
	
	public Window parent() {
		return this.parent;
	}
	
	public void parent(Window parent) {
		this.parent = parent;
	}
	
	public boolean locked() {
		return this.locked;
	}
	
	public void locked(boolean locked) {
		this.locked = locked;
	}
	
	public boolean border() {
		return this.border;
	}
	
	public void border(boolean border) {
		this.border = border;
	}
	
	public void icon(Image icon) {
		this.icon = icon;
	}
	
	public void title(String title) {
		this.title = title;
	}
	
	public int x() {
		return this.x;
	}
	
	public void x(int x) {
		this.x = x;
	}
	
	public int y() {
		return this.y;
	}
	
	public void y(int y) {
		this.y = y;
	}
	
	public int width() {
		return this.width;
	}
	
	public void width(int width) {
		this.width = width;
	}
	
	public int height() {
		return this.height;
	}
	
	public void height(int height) {
		this.height = height;
	}
	
	public EventRegistry eventRegistry() {
		return this.eventReg;
	}
}
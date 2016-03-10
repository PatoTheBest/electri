package net.prefixaut.deadalus;

import java.util.HashMap;
import java.util.Map;

import net.prefixaut.deadalus.styles.Opacity;
import net.prefixaut.deadalus.util.FileLoader;
import net.prefixaut.deadalus.util.ScriptLoader;
import net.prefixaut.deadalus.util.StyleLoader;

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
	 * Determines if the System/OS-Border should be displayed on the Window.
	 */
	private boolean displayBorder = true;
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
	 * Determines if the parent-Window is click/select-able or not when the window is shown. For example it can be used in a Pop-Up to prevent using the main Window without
	 * finishing the Pop-Up.
	 */
	private boolean parentLocked = false;
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
	private Size x = new Size(0), y = new Size(0);
	/**
	 * Width and Height of the Window on the Screen.
	 */
	private Size width = new Size(0), height = new Size(0);
	/**
	 * Opacity-Level of the Window. Range: 0-100 (%)
	 */
	private Opacity opacity = new Opacity(100.0D);
	/**
	 * Variables of the Document which can be used to insert it somewhere dynamically
	 */
	private Map<String, Object> vars = new HashMap<>();
	/**
	 * File-Loaders which handle File loadings. Mapped by the lower-case name.
	 */
	private Map<String, FileLoader> loader = new HashMap<>();
	/**
	 * TypeLoaders which load/parse a File/String and append it as CSS-Block into the Document. Mapped by the lower-case type-name.
	 */
	private Map<String, StyleLoader> stylers = new HashMap<>();
	/**
	 * TypeLoaaders which load/parse a File/String and executes the Code. Mapped by the lower-case type-name.
	 */
	private Map<String, ScriptLoader> scripters = new HashMap<>();
	
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
	
	public Size x() {
		return this.x;
	}
	
	public void x(Size x) {
		this.x = x;
	}
	
	public Size y() {
		return this.y;
	}
	
	public void y(Size y) {
		this.y = y;
	}
	
	public Object variable(String name) {
		return this.vars.get(name);
	}
	
	public void variable(String name, Object obj) {
		this.vars.put(name, obj);
	}
	
	public FileLoader loader(String name) {
		return this.loader.get(name);
	}
	
	public void loader(String name, FileLoader loader) {
		this.loader.put(name, loader);
	}
	
	public StyleLoader styler(String name) {
		return this.stylers.get(name);
	}
	
	public void styler(String name, StyleLoader styler) {
		this.stylers.put(name, styler);
	}
	
	public ScriptLoader scripter(String name) {
		return this.scripters.get(name);
	}
	
	public void scripter(String name, ScriptLoader scripter) {
		this.scripters.put(name, scripter);
	}
}
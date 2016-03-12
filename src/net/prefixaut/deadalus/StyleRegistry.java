package net.prefixaut.deadalus;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import net.prefixaut.deadalus.css.Style;

/**
 * Registry which keeps track of all Styles. Styles are mapped with the Style-Name, so only one can exist. The Registry is and should be used to access Styles in general, for
 * example in a custom Style-Parser.
 * 
 * @since 1.0.0
 * @author PreFiXAUT
 * @version 1.0.0
 */
public class StyleRegistry {
	
	/**
	 * The contents of the Registry.
	 */
	private Map<String, Class<Style>> styles = new HashMap<>();
	
	/**
	 * Removing constructor to prevent multiple Registers.
	 */
	protected StyleRegistry() {}
	
	/**
	 * Registers a new Style with it's name for global usage.
	 * 
	 * @param name
	 *            Name of the Style. Has to match the following RegEx -> "[a-zA-Z+-_0-9]".
	 * @param styleClass
	 *            Class of the Style.
	 * @return If the registering overwrote another Style or not.
	 * @throws IllegalArgumentException
	 *             When a Parameter is NULL or when the name is invalid.
	 */
	public boolean register(String name, Class<Style> styleClass) {
		if (name == null) throw new IllegalArgumentException("NULL is an invalid name!");
		if (name.trim().equals("")) throw new IllegalArgumentException("The name cannot be empty!");
		if (!Pattern.matches("[a-zA-Z+-_0-9]", name)) throw new IllegalArgumentException("The name contains invalid characters!");
		if (styleClass == null) throw new IllegalArgumentException("NULL is an invalid Class!");
		Object r = this.styles.put(name.toLowerCase(), styleClass);
		return r != null;
	}
	
	/**
	 * Attempts to unregister an Style from the Registry.
	 * 
	 * @param name
	 *            Name of the Style you want to unregister.
	 * @return If the Style has been unregistered.
	 */
	public boolean unregister(String name) {
		if (name == null) throw new IllegalArgumentException("NULL is an invalid name!");
		if (name.trim().equals("")) throw new IllegalArgumentException("The name cannot be empty!");
		Object r = this.styles.remove(name.toLowerCase());
		return r != null;
	}
	
	/**
	 * Attempts to get a Style-Class from the given name.
	 * 
	 * @param name
	 * @return
	 */
	public Class<Style> get(String name) {
		if (name == null) throw new IllegalArgumentException("NULL is an invalid name!");
		if (name.trim().equals("")) throw new IllegalArgumentException("The name cannot be empty!");
		return this.styles.get(name.toLowerCase());
	}
}
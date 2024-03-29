package net.prefixaut.deadalus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.prefixaut.deadalus.css.Style;
import net.prefixaut.deadalus.css.StyleState;
import net.prefixaut.deadalus.styles.Content;
import net.prefixaut.deadalus.styles.Display;
import net.prefixaut.deadalus.styles.Margin;
import net.prefixaut.deadalus.styles.Opacity;
import net.prefixaut.deadalus.styles.Padding;
import net.prefixaut.deadalus.styles.Position;
import net.prefixaut.deadalus.styles.Visibility;
import net.prefixaut.deadalus.styles.ZIndex;
import net.prefixaut.deadalus.util.CSS3;
import net.prefixaut.deadalus.xml.Element;
import net.prefixaut.prelib.Filter;
import net.prefixaut.prelib.sync.SyncArrayList;
import net.prefixaut.prelib.sync.SyncPairMap;

/**
 * Very basic Object which can be displayed via PILL.
 * 
 * Every Object which extends this Component requires one Constructor which takes a String as an ID for that Item.
 * 
 * @author PreFiXAUT
 * 		
 */
public abstract class Component implements Element<Component>, Serializable {
	
	private static final long serialVersionUID = 0x1000200010000001L;
	/**
	 * XML Name (<%name% ...>), which is used for parsing
	 */
	protected String name;
	/**
	 * Parent of this Component
	 */
	protected Component parent = null;
	/**
	 * Attributes of this Component, for example src="/file.txt" would be mapped as {"src", "/file.txt"}
	 */
	protected SyncPairMap<String, Object> attributes = new SyncPairMap<>();
	/**
	 * All children of this Component. Note: Contains ONLY the direct/1st grade Children of this Component.
	 */
	protected SyncArrayList<Component> children = new SyncArrayList<>();
	/**
	 * Indicates if this Component is capable to use Children.
	 */
	protected boolean allowChildren = true;
	/**
	 * Filter which can be used to deny certain Children to be added.
	 */
	protected Filter<Component> childrenFilter = (component) -> {
		return true;
	};
	/**
	 * Data which is stored in this Component. Does NOT contain the children/other DOM entries, only RAW Data (String, Boolean, Integer, ...)
	 */
	protected Object content = null;
	/**
	 * Determines the current Style-State of this Component.
	 */
	protected StyleState styleState = CSS3.States.NORMAL;
	/**
	 * Map which contains all Styles, mapped with their CSS-Names (Same as in the Style-Registry).
	 */
	protected Map<String, Style> styles = new HashMap<>();
	
	public Component() {
		this.styles.put("width", Size.AUTO);
		this.styles.put("height", Size.AUTO);
		this.styles.put("min-width", Size.AUTO);
		this.styles.put("min-height", Size.AUTO);
		this.styles.put("max-width", Size.AUTO);
		this.styles.put("max-height", Size.AUTO);
		this.styles.put("content", new Content() {
			
			boolean important = false;
			Object content = null;
			
			@Override
			public String css() {
				return this.content.toString();
			}
			
			@Override
			public boolean important() {
				return this.important;
			}
			
			@Override
			public void important(boolean important) {
				this.important = important;
			}
			
			@Override
			public Object content() {
				return this.content;
			}
			
			@Override
			public void content(Object content) {
				this.content = content;
			}
		});
		this.styles.put("padding", new Padding());
		this.styles.put("margin", new Margin());
		this.styles.put("top", new Size(0));
		this.styles.put("right", new Size(0));
		this.styles.put("bottom", new Size(0));
		this.styles.put("right", new Size(0));
		this.styles.put("z-index", new ZIndex(0));
		this.styles.put("position", Position.STATIC);
		this.styles.put("visibility", Visibility.VISIBLE);
		this.styles.put("display", Display.INLINE);
		this.styles.put("opacity", new Opacity(100.0D));
		// TODO: Set font
		this.styles.put("font", null);
	}
	
	public Component(Component parent) {
		this();
		this.parent = parent;
	}
	
	public final String name() {
		return this.name;
	}
	
	public final void name(String name) {
		this.name = name;
	}
	
	public Component parent() {
		return this.parent;
	}
	
	public void parent(Component parent) {
		this.parent.children.remove(this);
		this.parent = parent;
	}
	
	public Style style(String name) {
		return this.styles.get(name);
	}
	
	public boolean style(String name, Style style) {
		return this.styles.put(name, style) != null;
	}
	
	/**
	 * Gets the CSS-ID of this Component.
	 */
	public final String id() {
		return this.attribute("id").toString();
	}
	
	/**
	 * Sets the CSS-ID of this Component.
	 */
	public final void id(String cssID) {
		this.attributes("id", cssID);
	}
	
	/**
	 * Adds CSS-Classes to this Component.
	 */
	public final void addClass(String... cssClasses) {
		if (cssClasses == null) throw new IllegalArgumentException("NULL is not a valid Parameter!");
		this.addClass(Arrays.asList(cssClasses));
	}
	
	/**
	 * Adds CSS-Classes to this Component.
	 */
	public final void addClass(Collection<String> cssClasses) {
		if (cssClasses == null) throw new IllegalArgumentException("NULL is not a valid Parameter!");
		List<String> t = this.classes();
		// Add new classes
		for (String s : cssClasses)
			if (s != null) t.add(s);
		// Set it
		this.attributes("class", t);
	}
	
	/**
	 * Gets all CSS-Classes of this Component.
	 */
	public final List<String> classes() {
		Object o = this.attribute("class");
		List<String> t = new ArrayList<String>();
		// Put the current converted values into new list
		if (o == null) {
			o = new ArrayList<String>();
		} else if (o.getClass().isArray()) {
			Object[] r = (Object[]) o;
			for (int i = 0; i < r.length; i++)
				if (r[i] != null) t.add(r.toString());
		} else if (o instanceof List<?>) {
			List<?> tmp = (List<?>) o;
			for (Object obj : tmp)
				if (obj != null) t.add(obj.toString());
		} else {
			t.add(o.toString());
		}
		return t;
	}
	
	/**
	 * Removes CSS-Classes from this Component.
	 */
	public final void removeClass(String... cssClasses) {
		if (cssClasses == null) throw new IllegalArgumentException("NULL is not a valid Parameter!");
		this.removeClass(Arrays.asList(cssClasses));
	}
	
	/**
	 * Removes CSS-Classes from this Component.
	 */
	public final void removeClass(Collection<String> cssClasses) {
		if (cssClasses == null) throw new IllegalArgumentException("NULL is not a valid Parameter!");
		List<String> t = this.classes();
		t.removeAll(cssClasses);
		this.attributes("class", t);
	}
	
	/**
	 * Gets all Children of this Component.
	 */
	public final SyncArrayList<Component> children() {
		return this.children.getCopy();
	}
	
	public final boolean children(Component... children) {
		this.children.clear();
		return this.children.addAll(children);
	}
	
	public final boolean children(Collection<Component> children) {
		this.children.clear();
		return this.children.addAll(children);
	}
	
	/**
	 * Adds Children to this Component.
	 */
	public final boolean addChildren(Component... children) {
		return this.addChildren(Arrays.asList(children));
	}
	
	/**
	 * Adds Children to this Component.
	 */
	public final boolean addChildren(Collection<Component> children) {
		if (!this.allowChildren) return false;
		List<Component> c = new ArrayList<>();
		for (Component cp : children) {
			if (this.childrenFilter.allow(cp)) c.add(cp);
		}
		return this.children.addAll(c);
	}
	
	/**
	 * Removes Children from this Component.
	 */
	public final boolean removeChildren(Component... children) {
		return this.children.removeAll(children);
	}
	
	/**
	 * Removes multiple Children from this Component.
	 */
	public final boolean removeChildren(Collection<Component> children) {
		return this.children.removeAll(children);
	}
	
	@Override
	public final SyncPairMap<String, Object> attributes() {
		return this.attributes.getCopy();
	}
	
	@Override
	public final boolean attributes(String name, Object value) {
		this.attributes.put(name, value);
		return true;
	}
	
	public final boolean attributes(Map<String, Object> map) {
		for (Entry<String, Object> e : map.entrySet()) {
			this.attributes.put(e.getKey(), e.getValue());
		}
		return true;
	}
	
	public final Object attribute(String attr) {
		return this.attributes.get(attr);
	}
	
	protected final void allowChildren(boolean allowChildren) {
		this.allowChildren = allowChildren;
	}
	
	protected final boolean allowChildren() {
		return this.allowChildren;
	}
	
	protected final void childrenFilter(Filter<Component> filter) {
		this.childrenFilter = filter;
	}
	
	public final Filter<Component> childrenFilter() {
		return this.childrenFilter;
	}
}
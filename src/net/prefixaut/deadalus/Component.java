package net.prefixaut.deadalus;

import java.util.Collection;

import net.prefixaut.deadalus.util.CSS3;
import net.prefixaut.deadalus.util.StyleState;
import net.prefixaut.prelib.IDGenerator;
import net.prefixaut.prelib.SyncArrayList;
import net.prefixaut.prelib.SyncPairMap;
import net.prefixaut.prelib.Syncbase;
import net.prefixaut.prelib.util.Filter;
import net.prefixaut.prelib.xml.Element;

/**
 * Very basic Object which can be displayed via XPIL.
 * 
 * Every Object which extends this Component requires one Constructor which takes a String as an ID for that Item.
 * 
 * @author PreFiXAUT
 *
 */
public abstract class Component extends Syncbase<Component> implements Element<Component> {
	
	private static final long serialVersionUID = 0x1000200010000001L;
	
	private static final IDGenerator idgen = new IDGenerator("Component[####-####-####-####]", IDGenerator.HEXADECIMAL);
	private final String permID;
	/**
	 * CSS-ID of this Component.
	 */
	protected String cssID;
	/**
	 * List of all CSS-Classes this Component has.
	 */
	protected SyncArrayList<String> cssClasses = new SyncArrayList<>();
	/**
	 * Attributes of this Component, for example src="/file.txt" would be mapped as {"src", "file.txt"}
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
	 * Determines the Width and Height of this Component.
	 */
	protected Size width = Size.AUTO, height = Size.AUTO;
	protected Size minWidth = Size.AUTO, minHeight = Size.AUTO;
	protected Size maxWidth = Size.AUTO, maxHeight = Size.AUTO;
	
	/**
	 * Creates a new Component.
	 * 
	 * @param id
	 *            Id of this Component used internally as Identifier and as the CSS-ID.
	 * @see Component#id
	 */
	public Component(String cssID) {
		this.permID = idgen.getAndNext();
		this.cssID = cssID;
	}
	
	public final Size getWidth() {
		return this.width;
	}
	
	public final void setWidth(Size width) {
		this.width = width;
	}
	
	public final Size getHeight() {
		return this.height;
	}
	
	public final void setHeight(Size height) {
		this.height = height;
	}
	
	public final Size getMaxWidth() {
		return this.maxWidth;
	}
	
	public final void setMaxWidth(Size maxWidth) {
		this.maxWidth = maxWidth;
	}
	
	public final Size getMaxHeight() {
		return this.maxHeight;
	}
	
	public final void setMaxHeight(Size maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public final Size getMinWidth() {
		return this.minWidth;
	}
	
	public final void setMinWidth(Size minWidth) {
		this.minWidth = minWidth;
	}
	
	public final Size getMinHeight() {
		return this.minHeight;
	}
	
	public final void setMinHeight(Size minHeight) {
		this.minHeight = minHeight;
	}
	
	/**
	 * Gets the ID of this Component.
	 * 
	 * @see Component#id
	 */
	public final String getCssID() {
		return this.cssID;
	}
	
	/**
	 * Sets the ID of this Component.
	 * 
	 * @see Component#id
	 */
	public final void setCssID(String cssID) {
		this.cssID = cssID;
	}
	
	/**
	 * Adds a CSS-Class to this Component.
	 * 
	 * @see Component#cssClasses
	 */
	public final boolean addCssClass(String cssClass) {
		return this.cssClasses.add(cssClass);
	}
	
	/**
	 * Adds multiple CSS-Classes to this Component.
	 * 
	 * @see Component#cssClasses
	 */
	public final boolean addCssClasses(String... cssClasses) {
		return this.cssClasses.addAll(cssClasses);
	}
	
	/**
	 * Adds multiple CSS-Classes to this Component.
	 * 
	 * @see Component#cssClasses
	 */
	public final boolean addCssClasses(Collection<String> cssClasses) {
		return this.cssClasses.addAll(cssClasses);
	}
	
	/**
	 * Gets all CSS-Classes of this Component.
	 * 
	 * @see Component#cssClasses
	 */
	public final SyncArrayList<String> getCssClasses() {
		return this.cssClasses.getCopy();
	}
	
	/**
	 * Removes a CSS-Class from this Component.
	 * 
	 * @see Component#cssClasses
	 */
	public final boolean removeCssClass(String cssClass) {
		return this.cssClasses.remove(cssClass);
	}
	
	/**
	 * Removes multiple CSS-Classes from this Component.
	 * 
	 * @see Component#cssClasses
	 */
	public final boolean removeCssClasses(String... cssClasses) {
		return this.cssClasses.removeAll(cssClasses);
	}
	
	/**
	 * Removes multiple CSS-Classes from this Component.
	 * 
	 * @see Component#cssClasses
	 */
	public final boolean removeCssClasses(Collection<String> cssClasses) {
		return this.cssClasses.removeAll(cssClasses);
	}
	
	/**
	 * Gets all Children of this Component.
	 * 
	 * @see Component#children
	 */
	public final SyncArrayList<Component> getChildren() {
		return this.children.getCopy();
	}
	
	/**
	 * Adds a Child to this Component.
	 * 
	 * @see Component#children
	 */
	@Override
	public final boolean addChild(Component child) {
		if (!this.allowChildren) return false;
		if (!this.childrenFilter.allow(child)) return false;
		else return this.children.add(child);
	}
	
	/**
	 * Adds multiple Children to this Component.
	 * 
	 * @see Component#children
	 */
	@Override
	public final boolean addChildren(Component... children) {
		boolean flag = true;
		for (int i = 0; i < children.length; i++)
			if (!this.addChild(children[i])) flag = false;
		return flag;
	}
	
	/**
	 * Adds multiple Children to this Component.
	 * 
	 * @see Component#children
	 */
	@Override
	public final boolean addChildren(Collection<Component> children) {
		boolean flag = true;
		for (Component c : children)
			if (!this.addChild(c)) flag = false;
		return flag;
	}
	
	/**
	 * Removes a Child from this Component.
	 * 
	 * @see Component#children
	 */
	@Override
	public final boolean removeChild(Component child) {
		return this.children.remove(child);
	}
	
	/**
	 * Removes multiple Children from this Component.
	 * 
	 * @see Component#children
	 */
	@Override
	public final boolean removeChildren(Component... children) {
		return this.children.removeAll(children);
	}
	
	/**
	 * Removes multiple Children from this Component.
	 * 
	 * @see Component#children
	 */
	@Override
	public final boolean removeChildren(Collection<Component> children) {
		return this.children.removeAll(children);
	}
	
	@Override
	public final SyncPairMap<String, Object> getAttributes() {
		return this.attributes.getCopy();
	}
	
	@Override
	public final boolean setAttribute(String name, Object value) {
		this.attributes.put(name, value);
		return true;
	}
	
	@Override
	public final Object getAttributeValue(String attr) {
		return this.attributes.get(attr);
	}
	
	protected final void setAllowChildren(boolean allowChildren) {
		this.allowChildren = allowChildren;
	}
	
	protected final boolean allowChildren() {
		return this.allowChildren;
	}
	
	protected final void setChildrenFilter(Filter<Component> filter) {
		this.childrenFilter = filter;
	}
	
	public final Filter<Component> getChildrenFilter() {
		return this.childrenFilter;
	}
	
	protected final String getPermanentID() {
		return this.permID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (permID == null) ? 0 : permID.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Component other = (Component) obj;
		if (permID == null) {
			if (other.permID != null) return false;
		} else if (!permID.equals(other.permID)) return false;
		return true;
	}
}
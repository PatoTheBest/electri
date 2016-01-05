package net.prefixaut.deadalus;

import java.io.Serializable;

import net.prefixaut.deadalus.styles.Display;
import net.prefixaut.deadalus.styles.EdgePosition;
import net.prefixaut.deadalus.styles.Font;
import net.prefixaut.deadalus.styles.Margin;
import net.prefixaut.deadalus.styles.Opacity;
import net.prefixaut.deadalus.styles.Padding;
import net.prefixaut.deadalus.styles.Position;
import net.prefixaut.deadalus.styles.Visibility;

public abstract class BasicComponent extends Component implements Serializable {
	
	private static final long serialVersionUID = 0x1000200010000005L;
	protected Padding padding = new Padding();
	protected Margin margin = new Margin();
	protected EdgePosition edgePosition = new EdgePosition();
	protected int zIndex = 0;
	protected Position position = Position.STATIC;
	protected Visibility visibility = Visibility.VISIBLE;
	protected Display display = Display.INLINE;
	protected Font font;
	protected Opacity opacity = new Opacity(100.0D);
	
	public BasicComponent(String name) {
		super(name);
	}
	
	public BasicComponent(String name, Component parent) {
		super(name, parent);
	}
	
	public Padding padding() {
		return this.padding;
	}
	
	public void padding(Padding padding) {
		this.padding = padding;
	}
	
	public Margin margin() {
		return this.margin;
	}
	
	public void margin(Margin margin) {
		this.margin = margin;
	}
	
	public EdgePosition edgePosition() {
		return this.edgePosition;
	}
	
	public void edgePosition(EdgePosition pos) {
		this.edgePosition = pos;
	}
	
	public int zIndex() {
		return this.zIndex;
	}
	
	public void zIndex(int index) {
		this.zIndex = index;
	}
	
	public Position position() {
		return this.position;
	}
	
	public void position(Position pos) {
		this.position = pos;
	}
	
	public Visibility visibility() {
		return this.visibility;
	}
	
	public void visibility(Visibility visibility) {
		this.visibility = visibility;
	}
	
	public Display display() {
		return this.display;
	}
	
	public void display(Display display) {
		this.display = display;
	}
	
	public Font font() {
		return this.font;
	}
	
	public void font(Font font) {
		this.font = font;
	}
	
	public Opacity opacity() {
		return this.opacity;
	}
	
	public void opacity(Opacity opacity) {
		this.opacity = opacity;
	}
}
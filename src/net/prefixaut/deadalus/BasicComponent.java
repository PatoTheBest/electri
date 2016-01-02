package net.prefixaut.deadalus;

import java.io.Serializable;

import net.prefixaut.deadalus.styles.Display;
import net.prefixaut.deadalus.styles.EdgePosition;
import net.prefixaut.deadalus.styles.Font;
import net.prefixaut.deadalus.styles.Margin;
import net.prefixaut.deadalus.styles.Padding;
import net.prefixaut.deadalus.styles.Position;
import net.prefixaut.deadalus.styles.Visibility;
import net.prefixaut.prelib.util.Limited;
import net.prefixaut.prelib.xml.DocumentQuery;

public abstract class BasicComponent extends Component implements Serializable {
	
	private static final long serialVersionUID = 0x1000200010000005L;
	
	protected Padding padding = new Padding();
	protected Margin margin = new Margin();
	protected EdgePosition position = new EdgePosition();
	protected int zIndex = 0;
	protected Position positionType = Position.STATIC;
	protected Visibility visibility = Visibility.VISIBLE;
	protected Display display = Display.INLINE;
	protected Font font;
	protected Limited<Double> opacity = new Limited<>(0.0D, 100.0D);
	
	public BasicComponent(String id) {
		super(id);
	}
	
	@Override
	public Component[] query(DocumentQuery<Component> docQuery, String query) {
		return docQuery.query(this, query);
	}
}
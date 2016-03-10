package net.prefixaut.deadalus.util;

import net.prefixaut.deadalus.Component;
import net.prefixaut.deadalus.SizeUnit;
import net.prefixaut.deadalus.css.StyleState;
import net.prefixaut.deadalus.styles.Font;
import net.prefixaut.deadalus.units.Centimeter;
import net.prefixaut.deadalus.units.Inch;
import net.prefixaut.deadalus.units.Millimeter;
import net.prefixaut.deadalus.units.Picas;
import net.prefixaut.deadalus.units.Pixel;
import net.prefixaut.deadalus.units.Point;

/**
 * Class for default CSS-Variables and settings. All features are ruled with custom classes/interfaces and are expendable. The features in this class are the defaults and regulate
 * a normal behaviour.
 * 
 * @since 1.0.0
 * @author PreFiXAUT
 * @version 1.0.0
 */
public class CSS3 {
	
	/**
	 * Private Constructor to remove the Constructor since it's not being used.
	 */
	private CSS3() {}
	
	/**
	 * Defines default CSS-States for {@link Component Components}.
	 * 
	 * @author PreFiXAUT
	 */
	public static class States {
		
		/**
		 * Private Constructor to remove the Constructor since it's not being used.
		 */
		private States() {}
		
		/**
		 * Default/Normal State of the Component.
		 */
		public static final StyleState NORMAL = new StyleState() {};
		/**
		 * State when the Component or it's Parent is hovered.
		 */
		public static final StyleState HOVER = new StyleState() {};
		/**
		 * State when the Component or it's Parent is currently clicked. Mouse is clicking on it and hasn't released yet. Do not trigger click-events from here!
		 */
		public static final StyleState CLICKING = new StyleState() {};
		/**
		 * State when the Component was clicked on. For Example when a Link was clicked it changed it's style.
		 */
		public static final StyleState CLICKED = new StyleState() {};
	}
	
	/**
	 * Final instances of basic SizeUnits.
	 * 
	 * @author PreFiXAUT
	 *		
	 * @see SizeUnit
	 */
	public static class Units {
		
		/**
		 * Private Constructor to remove the Constructor since it's not being used.
		 */
		private Units() {}
		
		public static final SizeUnit CENTIMETER = new Centimeter();
		public static final SizeUnit INCH = new Inch();
		public static final SizeUnit MILLIMETER = new Millimeter();
		public static final SizeUnit PICAS = new Picas();
		public static final SizeUnit PIXEL = new Pixel();
		public static final SizeUnit POINT = new Point();
	}
	
	/**
	 * Class which only defines the default Values for the Font-Weight.
	 * 
	 * @author PreFiXAUT
	 * @see Font
	 */
	public static class FontWeight {
		
		/**
		 * Private Constructor to remove the Constructor since it's not being used.
		 */
		private FontWeight() {}
		
		public static final int NORMAL = 400;
		public static final int BOLD = 600;
		public static final int BOLDER = 700;
		public static final int LIGHTER = 300;
		public static final int INITIAL = NORMAL;
	}
}
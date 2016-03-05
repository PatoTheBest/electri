package net.prefixaut.deadalus.util;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.HashMap;

import net.prefixaut.deadalus.Component;
import net.prefixaut.deadalus.SizeUnit;
import net.prefixaut.deadalus.css.Style;
import net.prefixaut.deadalus.styles.Content;
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
	
	// TODO: Fix some shit
	
	/**
	 * Private Constructor to remove the Constructor since it's not being used.
	 */
	private CSS3() {}
	
	public static class Converter implements StyleConverter {
		
		/**
		 * Private Constructor to remove the Constructor since it's not being used.
		 */
		private Converter() {}
		
		private static final Converter converter = new Converter();
		
		public static Converter getInstance() {
			return converter;
		}
		
		@Override
		public Style[] convertStyles(String data) {
			data = data.trim();
			String[] lines = data.split("\n");
			for (String line : lines) {
				line = line.trim();
				if (line.startsWith("//")) continue;
			}
			return null;
		}
	}
	
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
	
	/**
	 * Default-Content Types. Used to modify the data of Components via CSS.
	 * 
	 * @author PreFiXAUT
	 *
	 */
	public static class Contents {
		
		/**
		 * Private Constructor to remove the Constructor since it's not being used.
		 */
		private Contents() {}
		
		/**
		 * Sets the Content to normal and removes all overrides/modifications.
		 */
		public static final Content NORMAL = new Content() {};
		/**
		 * Clears the Content of the Components.
		 */
		public static final Content NONE = new Content() {};
		/**
		 * Adds an "-Character to the start of the Contents-Data (if there isn't any yet) to define a beginning of a Quote.
		 */
		public static final Content OPEN_QUOTE = new Content() {};
		/**
		 * Adds an "-Character to the end of the Contents-Data (if there isn't any yet) to define a beginning of a Quote.
		 */
		public static final Content CLOSE_QUOTE = new Content() {};
		/**
		 * Removes any "-Character on the start of the Contents-Data (if there is any) to un-define it as a Quote.
		 */
		public static final Content NO_OPEN_QUOTE = new Content() {};
		/**
		 * Removes any "-Character on the end of the Contents-Data (if there is any) to un-define it as a Quote.
		 */
		public static final Content NO_CLOSE_QUOTE = new Content() {};
		/**
		 * Inherits the setting of the Components Parent.
		 */
		public static final Content INHERIT = new Content() {};
		
		/**
		 * Counter for a certain key. Used to keep track of certain amounts. Uses a static counter in the background which keeps track of the counter globally. This causes no
		 * complications since they are all mapped with the Counters-Key.
		 * 
		 * @author PreFiXAUT
		 */
		public static final class Counter implements Content {
			
			private static final HashMap<String, Integer> counters = new HashMap<String, Integer>();
			private String key;
			
			public Counter(String key) {
				this.key = key;
				this.check();
			}
			
			public String getKey() {
				return this.key;
			}
			
			public void setKey(String key) {
				this.key = key;
			}
			
			private void check() {
				if (!counters.containsKey(key)) counters.put(key, 0);
			}
			
			public int getCounter() {
				return counters.get(key);
			}
			
			public void setCounter(int amount) {
				counters.put(key, amount);
			}
			
			public void increment() {
				this.increment(1);
			}
			
			public void increment(int amount) {
				if (amount < 1) throw new IllegalArgumentException();
				this.check();
				counters.put(key, counters.get(key) + amount);
			}
			
			public void decrease() {
				this.decrease(1);
			}
			
			public void decrease(int amount) {
				if (amount > -1) throw new IllegalArgumentException();
				this.check();
				counters.put(key, counters.get(key) - amount);
			}

			@Override
			public java.lang.String css() {
				// TODO:
				return null;
			}
		}
		
		/**
		 * An Content-Type to get an Attribute-Value from the Component in CSS. For example '<link src="C:\image.png"/>', contains the Attribute 'src' which contains 'C:\image.png'
		 * 
		 * @author PreFiXAUT
		 */
		public static final class Attribute implements Content {
			
			private String attribute;
			
			public Attribute(String attribute) {
				this.attribute = attribute;
			}
			
			public String getAttribute() {
				return attribute;
			}
			
			public void setAttribute(String attribute) {
				this.attribute = attribute;
			}

			@Override
			public java.lang.String css() {
				// TODO:
				return null;
			}
		}
		
		/**
		 * Content which saves a String which overrides the Content of the Component.
		 * 
		 * @author PreFiXAUT
		 */
		public static final class String implements Content {
			
			private String string;
			
			public String(String string) {
				this.string = string;
			}
			
			public String getString() {
				return string;
			}
			
			public void setString(String string) {
				this.string = string;
			}

			@Override
			public java.lang.String css() {
				// TODO:
				return null;
			}
		}
		
		/**
		 * Media-Content which is getting displayed by the Component. Media can be anything which is possible to get loaded (Images, Videos, Music, ...)
		 * 
		 * @author PreFiXAUT
		 */
		public static final class Media implements Content {
			
			private File file;
			
			public Media(File file) {
				this.file = file;
			}
			
			public Media(URL url) {
				try {
					this.file = new File(url.toURI());
				} catch (URISyntaxException e) {
					this.file = new File(url.getPath());
				}
			}
			
			public Media(URI uri) {
				this.file = new File(uri);
			}
			
			public Media(Path path) {
				this.file = path.toFile();
			}
			
			public File getFile() {
				return file;
			}
			
			public void setFile(File file) {
				this.file = file;
			}

			@Override
			public java.lang.String css() {
				// TODO:
				return null;
			}
		}
	}
}
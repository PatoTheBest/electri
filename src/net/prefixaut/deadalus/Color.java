package net.prefixaut.deadalus;

import java.io.Serializable;

import net.prefixaut.deadalus.styles.Animatable;
import net.prefixaut.deadalus.styles.Animation;
import net.prefixaut.deadalus.styles.AnimationDirection;

/**
 * Class for Colours in Java.
 * 
 * @author PreFiXAUT
 */
public class Color implements Animatable<Color>, Serializable {
	
	private static final long serialVersionUID = 0x1000200010000003L;
	private byte defID = 0;
	/**
	 * Integer which represents the Color as Hex-Code (instead of 4 ints/bytes to save memory) formatted as RGBA
	 */
	private int value = 0x000000FF;
	public static final Color INVERTED = new Color((byte) 1);
	public static final Color INHERIT = new Color((byte) Byte.MAX_VALUE);
	
	private Color(byte defID) {
		this.defID = defID;
	}
	
	public Color() {}
	
	public Color(int red, int green, int blue) {
		this(red, green, blue, 0xFF);
	}
	
	public Color(int red, int green, int blue, int alpha) {
		this.check(red, green, blue);
		this.value = ( (red & 0xFF) << 24 | (green & 0xFF) << 16 | (blue & 0xFF) << 8 | (alpha & 0xFF) << 0);
	}
	
	public final int red() {
		return this.value >> 24 & 0xFF;
	}
	
	public final void red(int red) {
		this.check(red);
		this.value = ( (red & 0xFF) << 24 | (this.green() & 0xFF) << 16 | (this.blue() & 0xFF) << 8 | (this.alpha() & 0xFF) << 0);
	}
	
	public final int green() {
		return this.value >> 16 & 0xFF;
	}
	
	public final void green(int green) {
		this.check(green);
		this.value = ( (this.red() & 0xFF) << 24 | (green & 0xFF) << 16 | (this.blue() & 0xFF) << 8 | (this.alpha() & 0xFF) << 0);
	}
	
	public final int blue() {
		return this.value >> 8 & 0xFF;
	}
	
	public final void blue(int blue) {
		this.check(blue);
		this.value = ( (this.red() & 0xFF) << 24 | (this.green() & 0xFF) << 16 | (blue & 0xFF) << 8 | (this.alpha() & 0xFF) << 0);
	}
	
	public final int alpha() {
		return this.value >> 0 & 0xFF;
	}
	
	public final void alpha(int alpha) {
		this.check(alpha);
		this.value = ( (this.red() & 0xFF) << 24 | (this.green() & 0xFF) << 16 | (this.blue() & 0xFF) << 8 | (alpha & 0xFF) << 0);
	}
	
	public final int rgba() {
		return this.value;
	}
	
	public final int argb() {
		return ( (this.alpha() & 0xFF) << 24 | (this.red() & 0xFF) << 16 | (this.green() & 0xFF) << 8 | (this.blue() & 0xFF) << 0);
	}
	
	public Color invert() {
		return Color.invert(this);
	}
	
	/**
	 * Method to check if a Color-Value is valid (Between 0 and 255)
	 */
	private void check(int... ints) {
		for (int i = 0; i < ints.length; i++) if (ints[i] < 0 || ints[i] > 0xFF) throw new IllegalArgumentException("The Value is invalid since it's negative or bigger than 255!");
	}
	
	public static final Color ALICE_BLUE = Color.hex(0xF0F8FF);
	public static final Color ANTUQUE_WHITE = Color.hex(0xFAEBD7);
	public static final Color AQUA = Color.hex(0x00FFFF);
	public static final Color AQUA_MARINE = Color.hex(0x7FFFD4);
	public static final Color AZURE = Color.hex(0xF0FFFF);
	public static final Color BEIGE = Color.hex(0xF5F5DC);
	public static final Color BISQUE = Color.hex(0xFFE4C4);
	public static final Color BLACK = Color.hex(0x000000);
	public static final Color BLANCHED_ALMOND = Color.hex(0xFFEBCD);
	public static final Color BLUE = Color.hex(0x0000FF);
	public static final Color BLUE_VIOLET = Color.hex(0x8A2BE2);
	public static final Color BROWN = Color.hex(0x8A2BE2);
	public static final Color BURLY_WOOD = Color.hex(0xDEB887);
	public static final Color CADET_BLUE = Color.hex(0x5F9EA0);
	public static final Color CHARTREUSE = Color.hex(0x7FFF00);
	public static final Color CHOCOLATE = Color.hex(0xD2691E);
	public static final Color CORAL = Color.hex(0xFF7F50);
	public static final Color CORNFLOWER_BLUE = Color.hex(0x6495ED);
	public static final Color CORNSILK = Color.hex(0xFFF8DC);
	public static final Color CRIMSON = Color.hex(0xDC143C);
	public static final Color CYAN = Color.hex(0x00FFFF);
	public static final Color DARK_BLUE = Color.hex(0x00008B);
	public static final Color DARK_CYAN = Color.hex(0x008B8B);
	public static final Color DARK_GOLDEN_ROD = Color.hex(0xB8860B);
	public static final Color DARK_GRAY = Color.hex(0xA9A9A9);
	public static final Color DARK_GREEN = Color.hex(0x006400);
	public static final Color DARK_KHAKI = Color.hex(0xBDB76B);
	public static final Color DARK_MAGENTA = Color.hex(0x8B008B);
	public static final Color DARK_OLIVE_GREEN = Color.hex(0x556B2F);
	public static final Color DARK_ORANGE = Color.hex(0xFF8C00);
	public static final Color DARK_ORCHID = Color.hex(0x9932CC);
	public static final Color DARK_RED = Color.hex(0x8B0000);
	public static final Color DARK_SALMON = Color.hex(0xE9967A);
	public static final Color DARK_SEA_GREEN = Color.hex(0x8FBC8F);
	public static final Color DARK_SLATE_BLUE = Color.hex(0x483D8B);
	public static final Color DARK_SLATE_GRAY = Color.hex(0x2F4F4F);
	public static final Color DARK_TURQUISE = Color.hex(0x00CED1);
	public static final Color DARK_VIOLET = Color.hex(0x9400D3);
	public static final Color DEEP_PINK = Color.hex(0xFF1493);
	public static final Color DEEP_SKY_BLUE = Color.hex(0x00BFFF);
	public static final Color DIM_GRAY = Color.hex(0x696969);
	public static final Color DODGER_BLUE = Color.hex(0x1E90FF);
	public static final Color FIRE_BRICK = Color.hex(0xB22222);
	public static final Color FLORAL_WHITE = Color.hex(0xFFFAF0);
	public static final Color FOREST_GREEN = Color.hex(0x228B22);
	public static final Color FUCHSIA = Color.hex(0xFF00FF);
	public static final Color GAINSBORO = Color.hex(0xDCDCDC);
	public static final Color GHOST_WHITE = Color.hex(0xF8F8F8);
	public static final Color GOLD = Color.hex(0xFFD700);
	public static final Color GOLDEN_ROD = Color.hex(0xDAA520);
	public static final Color GRAY = Color.hex(0x808080);
	public static final Color GREEN = Color.hex(0x008000);
	public static final Color GREEN_YELLOW = Color.hex(0xADFF2F);
	public static final Color HONEY_DEW = Color.hex(0xF0FFF0);
	public static final Color HOT_PINK = Color.hex(0xFF69B4);
	public static final Color INDIAN_RED = Color.hex(0xCD5C5C);
	public static final Color INDIGO = Color.hex(0x4B0082);
	public static final Color IVORY = Color.hex(0xFFFFF0);
	public static final Color KHAKI = Color.hex(0xF0E68C);
	public static final Color LAVENDER = Color.hex(0xE6E6FA);
	public static final Color LAVENDER_BLUSH = Color.hex(0xFFF0F5);
	public static final Color LAWN_GREEN = Color.hex(0x7CFC00);
	public static final Color LEMON_CHOFFON = Color.hex(0xFFACD);
	public static final Color LIGHT_BLUE = Color.hex(0xADD8E6);
	public static final Color LIGHT_CORAL = Color.hex(0xF08080);
	public static final Color LIGHT_CYAN = Color.hex(0xE0FFFF);
	public static final Color LIGHT_GOLDEN_ROD_YELLOW = Color.hex(0xFAFAD2);
	public static final Color LIGHT_GRAY = Color.hex(0xD3D3D3);
	public static final Color LIGHT_GREEN = Color.hex(0x90EE90);
	public static final Color LIGHT_PINK = Color.hex(0xFFB6C1);
	public static final Color LIGHT_SALMON = Color.hex(0xFFA07A);
	public static final Color LIGHT_SEA_GREEN = Color.hex(0x20B2AA);
	public static final Color LIGHT_SKY_BLUE = Color.hex(0x87CEFA);
	public static final Color LIGHT_SLATE_GRAY = Color.hex(0x778899);
	public static final Color LIGHT_STEEL_BLUE = Color.hex(0xB0C4DE);
	public static final Color LIGHT_YELLOW = Color.hex(0xFFFFE0);
	public static final Color LIME = Color.hex(0x00FF00);
	public static final Color LIME_GREEN = Color.hex(0x32CF32);
	public static final Color LINEN = Color.hex(0xFAF0E6);
	public static final Color MAGENTA = Color.hex(0xFF00FF);
	public static final Color MAROON = Color.hex(0x800000);
	public static final Color MEDIUM_AQUA_MARINE = Color.hex(0x66CDAA);
	public static final Color MEDIUM_BLUE = Color.hex(0x0000CD);
	public static final Color MEDIUM_ORCHID = Color.hex(0xBA55D3);
	public static final Color MEDIUM_PURPLE = Color.hex(0x9370DB);
	public static final Color MEDIUM_SEA_GREEN = Color.hex(0x3CB371);
	public static final Color MEDIUM_SLATE_BLUE = Color.hex(0x7B68EE);
	public static final Color MEDIUM_SPRING_GREEN = Color.hex(0x00FA9A);
	public static final Color MEDIUM_TURQUOISE = Color.hex(0x48D1CC);
	public static final Color MEDIUM_VIOLET_RED = Color.hex(0xC71585);
	public static final Color MIDNIGHT_BLUE = Color.hex(0x191970);
	public static final Color MINT_CREAM = Color.hex(0xF5FFFA);
	public static final Color MISTY_ROSE = Color.hex(0xFFE4E1);
	public static final Color MOCCASIN = Color.hex(0xFFE4B5);
	public static final Color NAVAJO_WHITE = Color.hex(0xFFDEAD);
	public static final Color NAVY = Color.hex(0x000080);
	public static final Color OLD_LACE = Color.hex(0xFDF5E6);
	public static final Color OLIVE = Color.hex(0x808000);
	public static final Color OLIVE_DRAB = Color.hex(0x6B8E23);
	public static final Color ORANGE = Color.hex(0xFFA500);
	public static final Color ORANGE_RED = Color.hex(0xFF4500);
	public static final Color ORCHID = Color.hex(0xDA70D6);
	public static final Color PALE_GOLDEN_ROD = Color.hex(0xEEE8AA);
	public static final Color PALE_GREEN = Color.hex(0x98FB98);
	public static final Color PALE_TURQUOISE = Color.hex(0xAFEEEE);
	public static final Color PALE_VOILET_RED = Color.hex(0xDB7093);
	public static final Color PAPAYA_PUFF = Color.hex(0xFFEFD5);
	public static final Color PERU = Color.hex(0xCD853F);
	public static final Color PINK = Color.hex(0xFFC0CB);
	public static final Color PLUM = Color.hex(0xDDA0DD);
	public static final Color POWDER_BLUE = Color.hex(0xB0E0E6);
	public static final Color PURPLE = Color.hex(0x800080);
	public static final Color REBECCA_PURPLE = Color.hex(0x663399);
	public static final Color RED = Color.hex(0xFF0000);
	public static final Color ROSY_BROWN = Color.hex(0xBC8F8F);
	public static final Color ROYAL_BLUE = Color.hex(0x4169E1);
	public static final Color SADDLE_BROWN = Color.hex(0x8B4513);
	public static final Color SALMON = Color.hex(0xFA8072);
	public static final Color SANDY_BROWN = Color.hex(0xF4A460);
	public static final Color SEA_GREEN = Color.hex(0x2E8B57);
	public static final Color SEA_SHELL = Color.hex(0xFFF5EE);
	public static final Color SIENNA = Color.hex(0xA0522D);
	public static final Color SILVER = Color.hex(0xC0C0C0);
	public static final Color SKY_BLUE = Color.hex(0x87CEEB);
	public static final Color SLATE_BLUE = Color.hex(0x6A5ACD);
	public static final Color SLATE_GRAY = Color.hex(0x708090);
	public static final Color SNOW = Color.hex(0xFFFAFA);
	public static final Color SPRING_GREEN = Color.hex(0x00FF7F);
	public static final Color STEEL_BLUE = Color.hex(0x4682B4);
	public static final Color TAN = Color.hex(0xD2B48C);
	public static final Color TEAL = Color.hex(0x008080);
	public static final Color THISTLE = Color.hex(0xD8BFD8);
	public static final Color TOMATO = Color.hex(0xFF6347);
	public static final Color TURQUOISE = Color.hex(0x40E0D0);
	public static final Color TRANSPARENT = Color.argb(0, 0, 0, 0);
	public static final Color VOILET = Color.hex(0xEE82EE);
	public static final Color WHEAT = Color.hex(0xF5DEB3);
	public static final Color WHITE = Color.hex(0xFFFFFF);
	public static final Color WHITE_SMOKE = Color.hex(0xF5F5F5);
	public static final Color YELLOW = Color.hex(0xFFFF00);
	public static final Color YELLOW_GREEN = Color.hex(0x9ACD32);
	
	public static Color hex(String hex) {
		// TODO:
		return null;
	}
	
	public static Color hex(int hex) {
		return Color.hex(Integer.toHexString(hex));
	}
	
	public static Color rgb(int red, int green, int blue) {
		return new Color(red, green, blue);
	}
	
	public static Color argb(int alpha, int red, int green, int blue) {
		return new Color(alpha, red, green, blue);
	}
	
	public static Color rgba(int red, int green, int blue, int alpha) {
		return new Color(alpha, red, green, blue);
	}
	
	public static Color hsv(double hue, double saturation, double value) {
		// TODO:
		return Color.hex(0x000000);
	}
	
	public static Color hsva(double hue, double saturation, double light, int alpha) {
		// TODO:
		return Color.hex(0x000000);
	}
	
	public static Color hsl(double hue, double saturation, double value) {
		// TODO:
		return Color.hex(0x000000);
	}
	
	public static Color hsla(double hue, double saturation, double light, int alpha) {
		// TODO:
		return Color.hex(0x000000);
	}
	
	/**
	 * Inverts the given Color and returns the inverted Color. Used to make a Color surely visible, for example black text on white background.
	 */
	public static Color invert(Color color) {
		return Color.hex(0xFFFFFFFF - color.rgba());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Color other = (Color) obj;
		if (defID != other.defID) return false;
		if (value != other.value) return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Color {red=%d, green=%d, blue=%d, alpha=%d}", this.red(), this.green(), this.blue(), this.alpha());
	}
	
	@Override
	public Runnable animate(Color to, Animation an) {
		return () -> {
			double max = an.duration() / an.fps();
			double difA = (this.alpha() - to.alpha()) / max,
					difR = (this.red() - to.red()) / max,
					difG = (this.green() - to.green()) / max,
					difB = (this.blue() - to.blue()) / max;
			for (int i = 0; i < an.iterations(); i++) {
				long buffer = 0;
				for (long frame = 0; frame < max; frame++) {
					long start = System.currentTimeMillis();
					long timeout = 1;
					AnimationDirection d = an.direction();
					if (d == AnimationDirection.INHERIT) {
						// TODO: Handle INHERIT!
						d = AnimationDirection.NORMAL;
					}
					// Handling Alternate-Directions
					if (d == AnimationDirection.ALTERNATE) {
						d = i % 2 == 0 ? AnimationDirection.REVERSE : AnimationDirection.NORMAL;
					} else if (d == AnimationDirection.ALTERNATE_REVERSE) {
						d = i % 2 != 0 ? AnimationDirection.REVERSE : AnimationDirection.NORMAL;
					}
					// Getting timeout
					if (d == AnimationDirection.NORMAL) {
						timeout = an.timing().timing(an.fps(), an.duration(), frame);
					} else {
						timeout = an.timing().timing(an.fps(), an.duration(), (long) max - frame);
					}
					this.alpha((int) (this.alpha() + difA));
					this.red((int) (this.red() + difR));
					this.green((int) (this.green() + difG));
					this.blue((int) (this.blue() + difB));
					long end = System.currentTimeMillis();
					try {
						// Calculating buffer in case the frame took too long, so we reduce the next-frame duration the amount it was too much so they are even again.
						long tmp = (timeout - buffer) - (end - start);
						buffer = 0;
						if (tmp < 0) {
							buffer = tmp * -1;
							this.wait(0);
						} else this.wait(tmp);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				this.alpha(to.alpha());
				this.blue(to.blue());
				this.green(to.green());
				this.red(to.red());
				try {
					this.wait(an.delay());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}
}
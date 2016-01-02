package net.prefixaut.deadalus;

import java.io.Serializable;

import net.prefixaut.deadalus.styles.Animatable;
import net.prefixaut.deadalus.styles.Animation;
import net.prefixaut.deadalus.styles.AnimationDirection;
import net.prefixaut.prelib.util.Limited;

/**
 * Class for Colors in Java.
 * 
 * @author PreFiXAUT
 */
public class Color implements Animatable<Color>, Serializable {
	
	private static final long serialVersionUID = 0x1000200010000003L;
	private byte defID = 0;
	private Limited<Integer> alpha = new Limited<>(0, 255, 255);
	private Limited<Integer> red = new Limited<>(0, 255, 0);
	private Limited<Integer> green = new Limited<>(0, 255, 0);
	private Limited<Integer> blue = new Limited<>(0, 255, 0);
	public static final Color INVERTED = new Color((byte) 1);
	public static final Color INHERIT = new Color((byte) Byte.MAX_VALUE);
	
	private Color(byte defID) {
		this.defID = defID;
	}
	
	public Color() {}
	
	public Color(int red, int green, int blue) {
		this.setRed(red);
		this.setGreen(green);
		this.setBlue(blue);
	}
	
	public Color(int alpha, int red, int green, int blue) {
		this.setAlpha(alpha);
		this.setRed(red);
		this.setGreen(green);
		this.setBlue(blue);
	}
	
	public final int getAlpha() {
		return alpha.getValue();
	}
	
	public final void setAlpha(int alpha) {
		this.alpha.setValue(alpha);
	}
	
	public final int getRed() {
		return red.getValue();
	}
	
	public final void setRed(int red) {
		this.red.setValue(red);
	}
	
	public final int getGreen() {
		return green.getValue();
	}
	
	public final void setGreen(int green) {
		this.green.setValue(green);
	}
	
	public final int getBlue() {
		return blue.getValue();
	}
	
	public final void setBlue(int blue) {
		this.blue.setValue(blue);;
	}
	
	public static final Color ALICE_BLUE = Color.fromHex(0xF0F8FF);
	public static final Color ANTUQUE_WHITE = Color.fromHex(0xFAEBD7);
	public static final Color AQUA = Color.fromHex(0x00FFFF);
	public static final Color AQUA_MARINE = Color.fromHex(0x7FFFD4);
	public static final Color AZURE = Color.fromHex(0xF0FFFF);
	public static final Color BEIGE = Color.fromHex(0xF5F5DC);
	public static final Color BISQUE = Color.fromHex(0xFFE4C4);
	public static final Color BLACK = Color.fromHex(0x000000);
	public static final Color BLANCHED_ALMOND = Color.fromHex(0xFFEBCD);
	public static final Color BLUE = Color.fromHex(0x0000FF);
	public static final Color BLUE_VIOLET = Color.fromHex(0x8A2BE2);
	public static final Color BROWN = Color.fromHex(0x8A2BE2);
	public static final Color BURLY_WOOD = Color.fromHex(0xDEB887);
	public static final Color CADET_BLUE = Color.fromHex(0x5F9EA0);
	public static final Color CHARTREUSE = Color.fromHex(0x7FFF00);
	public static final Color CHOCOLATE = Color.fromHex(0xD2691E);
	public static final Color CORAL = Color.fromHex(0xFF7F50);
	public static final Color CORNFLOWER_BLUE = Color.fromHex(0x6495ED);
	public static final Color CORNSILK = Color.fromHex(0xFFF8DC);
	public static final Color CRIMSON = Color.fromHex(0xDC143C);
	public static final Color CYAN = Color.fromHex(0x00FFFF);
	public static final Color DARK_BLUE = Color.fromHex(0x00008B);
	public static final Color DARK_CYAN = Color.fromHex(0x008B8B);
	public static final Color DARK_GOLDEN_ROD = Color.fromHex(0xB8860B);
	public static final Color DARK_GRAY = Color.fromHex(0xA9A9A9);
	public static final Color DARK_GREEN = Color.fromHex(0x006400);
	public static final Color DARK_KHAKI = Color.fromHex(0xBDB76B);
	public static final Color DARK_MAGENTA = Color.fromHex(0x8B008B);
	public static final Color DARK_OLIVE_GREEN = Color.fromHex(0x556B2F);
	public static final Color DARK_ORANGE = Color.fromHex(0xFF8C00);
	public static final Color DARK_ORCHID = Color.fromHex(0x9932CC);
	public static final Color DARK_RED = Color.fromHex(0x8B0000);
	public static final Color DARK_SALMON = Color.fromHex(0xE9967A);
	public static final Color DARK_SEA_GREEN = Color.fromHex(0x8FBC8F);
	public static final Color DARK_SLATE_BLUE = Color.fromHex(0x483D8B);
	public static final Color DARK_SLATE_GRAY = Color.fromHex(0x2F4F4F);
	public static final Color DARK_TURQUISE = Color.fromHex(0x00CED1);
	public static final Color DARK_VIOLET = Color.fromHex(0x9400D3);
	public static final Color DEEP_PINK = Color.fromHex(0xFF1493);
	public static final Color DEEP_SKY_BLUE = Color.fromHex(0x00BFFF);
	public static final Color DIM_GRAY = Color.fromHex(0x696969);
	public static final Color DODGER_BLUE = Color.fromHex(0x1E90FF);
	public static final Color FIRE_BRICK = Color.fromHex(0xB22222);
	public static final Color FLORAL_WHITE = Color.fromHex(0xFFFAF0);
	public static final Color FOREST_GREEN = Color.fromHex(0x228B22);
	public static final Color FUCHSIA = Color.fromHex(0xFF00FF);
	public static final Color GAINSBORO = Color.fromHex(0xDCDCDC);
	public static final Color GHOST_WHITE = Color.fromHex(0xF8F8F8);
	public static final Color GOLD = Color.fromHex(0xFFD700);
	public static final Color GOLDEN_ROD = Color.fromHex(0xDAA520);
	public static final Color GRAY = Color.fromHex(0x808080);
	public static final Color GREEN = Color.fromHex(0x008000);
	public static final Color GREEN_YELLOW = Color.fromHex(0xADFF2F);
	public static final Color HONEY_DEW = Color.fromHex(0xF0FFF0);
	public static final Color HOT_PINK = Color.fromHex(0xFF69B4);
	public static final Color INDIAN_RED = Color.fromHex(0xCD5C5C);
	public static final Color INDIGO = Color.fromHex(0x4B0082);
	public static final Color IVORY = Color.fromHex(0xFFFFF0);
	public static final Color KHAKI = Color.fromHex(0xF0E68C);
	public static final Color LAVENDER = Color.fromHex(0xE6E6FA);
	public static final Color LAVENDER_BLUSH = Color.fromHex(0xFFF0F5);
	public static final Color LAWN_GREEN = Color.fromHex(0x7CFC00);
	public static final Color LEMON_CHOFFON = Color.fromHex(0xFFACD);
	public static final Color LIGHT_BLUE = Color.fromHex(0xADD8E6);
	public static final Color LIGHT_CORAL = Color.fromHex(0xF08080);
	public static final Color LIGHT_CYAN = Color.fromHex(0xE0FFFF);
	public static final Color LIGHT_GOLDEN_ROD_YELLOW = Color.fromHex(0xFAFAD2);
	public static final Color LIGHT_GRAY = Color.fromHex(0xD3D3D3);
	public static final Color LIGHT_GREEN = Color.fromHex(0x90EE90);
	public static final Color LIGHT_PINK = Color.fromHex(0xFFB6C1);
	public static final Color LIGHT_SALMON = Color.fromHex(0xFFA07A);
	public static final Color LIGHT_SEA_GREEN = Color.fromHex(0x20B2AA);
	public static final Color LIGHT_SKY_BLUE = Color.fromHex(0x87CEFA);
	public static final Color LIGHT_SLATE_GRAY = Color.fromHex(0x778899);
	public static final Color LIGHT_STEEL_BLUE = Color.fromHex(0xB0C4DE);
	public static final Color LIGHT_YELLOW = Color.fromHex(0xFFFFE0);
	public static final Color LIME = Color.fromHex(0x00FF00);
	public static final Color LIME_GREEN = Color.fromHex(0x32CF32);
	public static final Color LINEN = Color.fromHex(0xFAF0E6);
	public static final Color MAGENTA = Color.fromHex(0xFF00FF);
	public static final Color MAROON = Color.fromHex(0x800000);
	public static final Color MEDIUM_AQUA_MARINE = Color.fromHex(0x66CDAA);
	public static final Color MEDIUM_BLUE = Color.fromHex(0x0000CD);
	public static final Color MEDIUM_ORCHID = Color.fromHex(0xBA55D3);
	public static final Color MEDIUM_PURPLE = Color.fromHex(0x9370DB);
	public static final Color MEDIUM_SEA_GREEN = Color.fromHex(0x3CB371);
	public static final Color MEDIUM_SLATE_BLUE = Color.fromHex(0x7B68EE);
	public static final Color MEDIUM_SPRING_GREEN = Color.fromHex(0x00FA9A);
	public static final Color MEDIUM_TURQUOISE = Color.fromHex(0x48D1CC);
	public static final Color MEDIUM_VIOLET_RED = Color.fromHex(0xC71585);
	public static final Color MIDNIGHT_BLUE = Color.fromHex(0x191970);
	public static final Color MINT_CREAM = Color.fromHex(0xF5FFFA);
	public static final Color MISTY_ROSE = Color.fromHex(0xFFE4E1);
	public static final Color MOCCASIN = Color.fromHex(0xFFE4B5);
	public static final Color NAVAJO_WHITE = Color.fromHex(0xFFDEAD);
	public static final Color NAVY = Color.fromHex(0x000080);
	public static final Color OLD_LACE = Color.fromHex(0xFDF5E6);
	public static final Color OLIVE = Color.fromHex(0x808000);
	public static final Color OLIVE_DRAB = Color.fromHex(0x6B8E23);
	public static final Color ORANGE = Color.fromHex(0xFFA500);
	public static final Color ORANGE_RED = Color.fromHex(0xFF4500);
	public static final Color ORCHID = Color.fromHex(0xDA70D6);
	public static final Color PALE_GOLDEN_ROD = Color.fromHex(0xEEE8AA);
	public static final Color PALE_GREEN = Color.fromHex(0x98FB98);
	public static final Color PALE_TURQUOISE = Color.fromHex(0xAFEEEE);
	public static final Color PALE_VOILET_RED = Color.fromHex(0xDB7093);
	public static final Color PAPAYA_PUFF = Color.fromHex(0xFFEFD5);
	public static final Color PERU = Color.fromHex(0xCD853F);
	public static final Color PINK = Color.fromHex(0xFFC0CB);
	public static final Color PLUM = Color.fromHex(0xDDA0DD);
	public static final Color POWDER_BLUE = Color.fromHex(0xB0E0E6);
	public static final Color PURPLE = Color.fromHex(0x800080);
	public static final Color REBECCA_PURPLE = Color.fromHex(0x663399);
	public static final Color RED = Color.fromHex(0xFF0000);
	public static final Color ROSY_BROWN = Color.fromHex(0xBC8F8F);
	public static final Color ROYAL_BLUE = Color.fromHex(0x4169E1);
	public static final Color SADDLE_BROWN = Color.fromHex(0x8B4513);
	public static final Color SALMON = Color.fromHex(0xFA8072);
	public static final Color SANDY_BROWN = Color.fromHex(0xF4A460);
	public static final Color SEA_GREEN = Color.fromHex(0x2E8B57);
	public static final Color SEA_SHELL = Color.fromHex(0xFFF5EE);
	public static final Color SIENNA = Color.fromHex(0xA0522D);
	public static final Color SILVER = Color.fromHex(0xC0C0C0);
	public static final Color SKY_BLUE = Color.fromHex(0x87CEEB);
	public static final Color SLATE_BLUE = Color.fromHex(0x6A5ACD);
	public static final Color SLATE_GRAY = Color.fromHex(0x708090);
	public static final Color SNOW = Color.fromHex(0xFFFAFA);
	public static final Color SPRING_GREEN = Color.fromHex(0x00FF7F);
	public static final Color STEEL_BLUE = Color.fromHex(0x4682B4);
	public static final Color TAN = Color.fromHex(0xD2B48C);
	public static final Color TEAL = Color.fromHex(0x008080);
	public static final Color THISTLE = Color.fromHex(0xD8BFD8);
	public static final Color TOMATO = Color.fromHex(0xFF6347);
	public static final Color TURQUOISE = Color.fromHex(0x40E0D0);
	public static final Color TRANSPARENT = Color.fromARGB(0, 0, 0, 0);
	public static final Color VOILET = Color.fromHex(0xEE82EE);
	public static final Color WHEAT = Color.fromHex(0xF5DEB3);
	public static final Color WHITE = Color.fromHex(0xFFFFFF);
	public static final Color WHITE_SMOKE = Color.fromHex(0xF5F5F5);
	public static final Color YELLOW = Color.fromHex(0xFFFF00);
	public static final Color YELLOW_GREEN = Color.fromHex(0x9ACD32);
	
	public static Color fromString(String str) {
		str = str.trim();
		if (str.startsWith("#")) {
			str = str.substring(1);
			int red = 0, green = 0, blue = 0, alpha = 255;
			if (str.length() == 3 || str.length() == 4) {
				red = Integer.parseInt(str.substring(0, 1), 16);
				green = Integer.parseInt(str.substring(1, 2), 16);
				blue = Integer.parseInt(str.substring(2, 3), 16);
				if (str.length() == 4) {
					alpha = Integer.parseInt(str.substring(3, 4), 16);
				}
			} else if (str.length() >= 6) {
				red = Integer.parseInt(str.substring(0, 2), 16);
				green = Integer.parseInt(str.substring(2, 4), 16);
				blue = Integer.parseInt(str.substring(4, 6), 16);
				if (str.length() == 7) {
					alpha = Integer.parseInt(str.substring(6, 7), 16);
				} else if (str.length() == 8) {
					alpha = Integer.parseInt(str.substring(6, 8), 16);
				}
			}
			return new Color(alpha, red, green, blue);
		}
		return null;
	}
	
	public static Color fromHex(String hex) {
		if (hex.startsWith("#")) return Color.fromString(hex);
		else return Color.fromString("#" + hex);
	}
	
	public static Color fromHex(int hex) {
		return Color.fromHex(Integer.toHexString(hex));
	}
	
	public static Color fromRGB(int red, int green, int blue) {
		return new Color(red, green, blue);
	}
	
	public static Color fromARGB(int alpha, int red, int green, int blue) {
		return new Color(alpha, red, green, blue);
	}
	
	public static Color fromRGBA(int red, int green, int blue, int alpha) {
		return new Color(alpha, red, green, blue);
	}
	
	public static Color fromHSV(int hue, int saturation, int value) {
		int h = (int) (hue * 6);
		int f = (int) (hue * 6 - h);
		int p = (int) (value * (1 - saturation));
		int q = (int) (value * (1 - f * saturation));
		int t = (int) (value * (1 - (1 - f) * saturation));
		switch (h) {
			case 0:
				return new Color(value, t, p);
			case 1:
				return new Color(q, value, p);
			case 2:
				return new Color(p, value, t);
			case 3:
				return new Color(p, q, value);
			case 4:
				return new Color(t, p, value);
			case 5:
				return new Color(value, p, q);
		}
		return Color.fromHex(0x000000);
	}
	
	/**
	 * Inverts the given Color and returns the inverted Color.
	 * Used to make a Color surely visible, for example black text on white background.
	 */
	public static Color invert(Color color) {
		int r = color.red.getValue() + (255/2),
				b = color.blue.getValue() + (255/2),
				g = color.green.getValue() + (255/2);
		if (r > 255) r -= 255;
		if (b > 255) b -= 255;
		if (g > 255) g -= 255;
		return new Color(r, g, b);
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (alpha == null) ? 0 : alpha.hashCode());
		result = prime * result + ( (blue == null) ? 0 : blue.hashCode());
		result = prime * result + defID;
		result = prime * result + ( (green == null) ? 0 : green.hashCode());
		result = prime * result + ( (red == null) ? 0 : red.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Color other = (Color) obj;
		if (alpha == null) {
			if (other.alpha != null) return false;
		} else if (!alpha.equals(other.alpha)) return false;
		if (blue == null) {
			if (other.blue != null) return false;
		} else if (!blue.equals(other.blue)) return false;
		if (defID != other.defID) return false;
		if (green == null) {
			if (other.green != null) return false;
		} else if (!green.equals(other.green)) return false;
		if (red == null) {
			if (other.red != null) return false;
		} else if (!red.equals(other.red)) return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Color {alpha=" + alpha + ", red=" + red + ", green=" + green + ", blue=" + blue + "}";
	}
	
	@Override
	public Runnable animate(Color to, Animation an) {
		return () -> {
			double max = an.getDuration() / an.getFPS();
			double difA = (this.getAlpha() - to.getAlpha()) / max,
					difR = (this.getRed() - to.getRed()) / max,
					difG = (this.getGreen() - to.getGreen()) / max,
					difB = (this.getBlue() - to.getBlue()) / max;
			for (int i = 0; i < an.getIteration(); i++) {
				long buffer = 0;
				for (long frame = 0; frame < max; frame++) {
					long start = System.currentTimeMillis();
					long timeout = 1;
					AnimationDirection d = an.getDirection();
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
						timeout = an.getTiming().getTiming(an.getFPS(), an.getDuration(), frame);
					} else {
						timeout = an.getTiming().getTiming(an.getFPS(), an.getDuration(), (long) max - frame);
					}
					this.setAlpha((int) (this.getAlpha() + difA));
					this.setRed((int) (this.getRed() + difR));
					this.setGreen((int) (this.getGreen() + difG));
					this.setBlue((int) (this.getBlue() + difB));
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
				this.setAlpha(to.getAlpha());
				this.setBlue(to.getBlue());
				this.setGreen(to.getGreen());
				this.setRed(to.getRed());
				try {
					this.wait(an.getDelay());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}
}
package net.prefixaut.deadalus.styles;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

import net.prefixaut.deadalus.BufferedImage;
import net.prefixaut.deadalus.Image;
import net.prefixaut.deadalus.css.Style;

public class Cursor implements Style {
	
	private byte defID = 0;
	private boolean important = false;
	private Image image;
	public static final Cursor ALIAS = new Cursor((byte) 1);
	public static final Cursor ALL_SCROLL = new Cursor((byte) 2);
	public static final Cursor AUTO = new Cursor((byte) 3);
	public static final Cursor CELL = new Cursor((byte) 4);
	public static final Cursor CONTEXT_MENU = new Cursor((byte) 5);
	public static final Cursor COL_RESIZE = new Cursor((byte) 6);
	public static final Cursor COPY = new Cursor((byte) 7);
	public static final Cursor CROSSHAIR = new Cursor((byte) 8);
	public static final Cursor DEFAUL = new Cursor((byte) 9);
	public static final Cursor E_RESIZE = new Cursor((byte) 10);
	public static final Cursor EW_RESIZE = new Cursor((byte) 11);
	public static final Cursor GRAB = new Cursor((byte) 12);
	public static final Cursor GRABBING = new Cursor((byte) 13);
	public static final Cursor HELP = new Cursor((byte) 14);
	public static final Cursor MOVE = new Cursor((byte) 15);
	public static final Cursor N_RESIZE = new Cursor((byte) 16);
	public static final Cursor NE_RESIZE = new Cursor((byte) 17);
	public static final Cursor NESW_RESIZE = new Cursor((byte) 18);
	public static final Cursor NS_RESIZE = new Cursor((byte) 19);
	public static final Cursor NW_RESIZE = new Cursor((byte) 20);
	public static final Cursor NWSE_RESIZE = new Cursor((byte) 21);
	public static final Cursor NO_DROP = new Cursor((byte) 22);
	public static final Cursor NONE = new Cursor((byte) 23);
	public static final Cursor NOT_ALLOWED = new Cursor((byte) 24);
	public static final Cursor POINTER = new Cursor((byte) 25);
	public static final Cursor PROGRESS = new Cursor((byte) 26);
	public static final Cursor ROW_RESIZE = new Cursor((byte) 27);
	public static final Cursor S_RESIZE = new Cursor((byte) 28);
	public static final Cursor SE_RESIZE = new Cursor((byte) 29);
	public static final Cursor SW_RESIZE = new Cursor((byte) 30);
	public static final Cursor TEXT = new Cursor((byte) 31);
	public static final Cursor VERTICAL_TEXT = new Cursor((byte) 32);
	public static final Cursor W_RESIZE = new Cursor((byte) 33);
	public static final Cursor WAIT = new Cursor((byte) 34);
	public static final Cursor ZOOM_IN = new Cursor((byte) 35);
	public static final Cursor ZOOM_OUT = new Cursor((byte) 36);
	public static final Cursor INHERIT = new Cursor((byte) Byte.MAX_VALUE);
	
	private Cursor(byte defID) {
		this.defID = defID;
	}
	
	public Cursor(Image image) {
		this.image = image;
	}
	
	public Cursor(File file) {
		this.image = new BufferedImage(file);
	}
	
	public Cursor(URL url) {
		this.image = new BufferedImage(url);
	}
	
	public Cursor(URI uri) {
		this.image = new BufferedImage(uri);
	}
	
	public Cursor(Path path) {
		this.image = new BufferedImage(path);
	}
	
	public Cursor(String path) {
		this.image = new BufferedImage(path);
	}
	
	public Image image() {
		return image;
	}
	
	public void image(Image image) {
		this.image = image;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (image == null) ? 0 : image.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cursor other = (Cursor) obj;
		if (defID != other.defID)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		return true;
	}
	
	@Override
	public String css() {
		String r = "cursor: ";
		switch (this.defID) {
			case 1:
				r += "alias";
				break;
			case 2:
				r += "all-scroll";
				break;
			case 3:
				r += "auto";
				break;
			case 4:
				r += "cell";
				break;
			case 5:
				r += "context-menu";
				break;
			case 6:
				r += "col-resize";
				break;
			case 7:
				r += "copy";
				break;
			case 8:
				r += "crosshair";
				break;
			case 9:
				r += "default";
				break;
			case 10:
				r += "e-resize";
				break;
			case 11:
				r += "ew-resize";
				break;
			case 12:
				r += "grab";
				break;
			case 13:
				r += "grabbing";
				break;
			case 14:
				r += "help";
				break;
			case 15:
				r += "move";
				break;
			case 16:
				r += "n-resize";
				break;
			case 17:
				r += "ne-resize";
				break;
			case 18:
				r += "nesw-resize";
				break;
			case 19:
				r += "ns-resize";
				break;
			case 20:
				r += "nw-resize";
				break;
			case 21:
				r += "nwse-resize";
				break;
			case 22:
				r += "no-drop";
				break;
			case 23:
				r += "none";
				break;
			case 24:
				r += "not-allowed";
				break;
			case 25:
				r += "pointer";
				break;
			case 26:
				r += "progress";
				break;
			case 27:
				r += "row-resize";
				break;
			case 28:
				r += "s-resize";
				break;
			case 29:
				r += "se-resize";
				break;
			case 30:
				r += "sw-resize";
				break;
			case 31:
				r += "text";
				break;
			case 32:
				r += "vertical-text";
				break;
			case 33:
				r += "w-resize";
				break;
			case 34:
				r += "wait";
				break;
			case 35:
				r += "zoom-in";
				break;
			case 36:
				r += "zoom-out";
				break;
			case 37:
				r += "inherit";
				break;
			// TODO: Return Image
			default:
				return null;
		}
		r += ";";
		return r;
	}
	
	@Override
	public boolean important() {
		return this.important;
	}
	
	@Override
	public void important(boolean important) {
		this.important = important;
	}
}
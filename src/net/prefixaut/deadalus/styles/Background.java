package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Color;
import net.prefixaut.deadalus.Image;
import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.css.Style;

public class Background implements Style, Animatable<Background>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000006L;
	private byte defID = 0;
	private boolean important = false;
	private BackgroundPosition position = BackgroundPosition.LEFT_TOP;
	private BackgroundAttachment attachment = BackgroundAttachment.SCROLL;
	private BackgroundRepeat repeat = BackgroundRepeat.NONE;
	private BackgroundBlendMode blendMode = BackgroundBlendMode.NORMAL;
	private BackgroundClip clip = BackgroundClip.BORDER_BOX;
	private BackgroundOrigin origin = BackgroundOrigin.PADDING_BOX;
	private Image image = null;
	private Color color = new Color(0, 0, 0, 0);
	private Size width = Size.AUTO, height = Size.AUTO;
	public static final Background INHERIT = new Background((byte) Byte.MAX_VALUE);
	
	private Background(byte defID) {
		this.defID = defID;
	}
	
	public Background(Color color) {
		this.color = color;
	}
	
	public Background(Image image) {
		this.image = image;
	}
	
	public Background(Color color, Image image) {
		this.color = color;
		this.image = image;
	}
	
	public Background(Image image, BackgroundPosition position) {
		this.image = image;
		this.position = position;
	}
	
	public Background(Color color, Image image, BackgroundPosition position) {
		this.color = color;
		this.image = image;
		this.position = position;
	}
	
	public Background(Image image, BackgroundRepeat repeat) {
		this.image = image;
		this.repeat = repeat;
	}
	
	public Background(Color color, Image image, BackgroundRepeat repeat) {
		this.color = color;
		this.image = image;
		this.repeat = repeat;
	}
	
	public BackgroundPosition position() {
		return position;
	}
	
	public void position(BackgroundPosition position) {
		this.position = position;
	}
	
	public BackgroundAttachment attachment() {
		return attachment;
	}
	
	public void attachment(BackgroundAttachment attachment) {
		this.attachment = attachment;
	}
	
	public BackgroundRepeat repeat() {
		return repeat;
	}
	
	public void repeat(BackgroundRepeat repeat) {
		this.repeat = repeat;
	}
	
	public Image image() {
		return this.image;
	}
	
	public void image(Image image) {
		this.image = image;
	}
	
	public BackgroundClip clip() {
		return clip;
	}
	
	public void clip(BackgroundClip clip) {
		this.clip = clip;
	}
	
	public Color color() {
		return color;
	}
	
	public void color(Color color) {
		this.color = color;
	}
	
	public BackgroundOrigin origin() {
		return origin;
	}
	
	public void origin(BackgroundOrigin origin) {
		this.origin = origin;
	}
	
	public BackgroundBlendMode blend() {
		return blendMode;
	}
	
	public void blend(BackgroundBlendMode blendMode) {
		this.blendMode = blendMode;
	}
	
	public Size width() {
		return width;
	}
	
	public void width(Size width) {
		this.width = width;
	}
	
	public Size height() {
		return height;
	}
	
	public void height(Size height) {
		this.height = height;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + ( (blendMode == null) ? 0 : blendMode.hashCode());
		result = prime * result + ( (clip == null) ? 0 : clip.hashCode());
		result = prime * result + ( (color == null) ? 0 : color.hashCode());
		result = prime * result + defID;
		result = prime * result + ( (height == null) ? 0 : height.hashCode());
		result = prime * result + ( (image == null) ? 0 : image.hashCode());
		result = prime * result + ( (origin == null) ? 0 : origin.hashCode());
		result = prime * result + ( (position == null) ? 0 : position.hashCode());
		result = prime * result + ( (repeat == null) ? 0 : repeat.hashCode());
		result = prime * result + ( (width == null) ? 0 : width.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Background other = (Background) obj;
		if (attachment != other.attachment) return false;
		if (blendMode != other.blendMode) return false;
		if (clip != other.clip) return false;
		if (color == null) {
			if (other.color != null) return false;
		} else if (!color.equals(other.color)) return false;
		if (defID != other.defID) return false;
		if (height == null) {
			if (other.height != null) return false;
		} else if (!height.equals(other.height)) return false;
		if (image == null) {
			if (other.image != null) return false;
		} else if (!image.equals(other.image)) return false;
		if (origin != other.origin) return false;
		if (position == null) {
			if (other.position != null) return false;
		} else if (!position.equals(other.position)) return false;
		if (repeat != other.repeat) return false;
		if (width == null) {
			if (other.width != null) return false;
		} else if (!width.equals(other.width)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(Background to, Animation an) {
		return () -> {
			this.position().animate(to.position(), an).run();
			this.color().animate(to.color(), an).run();
			this.width().animate(to.width(), an).run();
			this.height().animate(to.height(), an).run();
		};
	}
	
	@Override
	public String css() {
		return String.format("%s %s %s %s %s %s %s", this.color(), this.image(), this.position(), this.repeat(), this.origin(), this.clip(), this.attachment());
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
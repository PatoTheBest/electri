package net.prefixaut.deadalus.styles;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

import net.prefixaut.deadalus.BufferedImage;
import net.prefixaut.deadalus.Image;
import net.prefixaut.deadalus.Size;

public class ImageBorder implements SingleBorder<ImageBorder>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000014L;
	private Image image;
	private Size width = new Size(0), slice = new Size(0),
			outsetTop = new Size(0), outsetRight = new Size(0),
			outsetBottom = new Size(0), outsetLeft = new Size(0);
	private ImageBorderRepeat repeat = ImageBorderRepeat.STRETCH;
	
	public ImageBorder(Image image) {
		this.image = image;
	}
	
	public ImageBorder(File file) {
		this.image = new BufferedImage(file);
	}
	
	public ImageBorder(URL url) {
		this.image = new BufferedImage(url);
	}
	
	public ImageBorder(URI uri) {
		this.image = new BufferedImage(uri);
	}
	
	public ImageBorder(Path path) {
		this.image = new BufferedImage(path);
	}
	
	public ImageBorder(String path) {
		this.image = new BufferedImage(path);
	}
	
	public ImageBorder(Image image, Size width) {
		this.image = image;
		this.width = width;
	}
	
	public ImageBorder(File file, Size width) {
		this.image = new BufferedImage(file);
		this.width = width;
	}
	
	public ImageBorder(URL url, Size width) {
		this.image = new BufferedImage(url);
		this.width = width;
	}
	
	public ImageBorder(URI uri, Size width) {
		this.image = new BufferedImage(uri);
		this.width = width;
	}
	
	public ImageBorder(Path path, Size width) {
		this.image = new BufferedImage(path);
		this.width = width;
	}
	
	public ImageBorder(String path, Size width) {
		this.image = new BufferedImage(path);
		this.width = width;
	}
	
	public ImageBorder(Image image, Size width, Size slice) {
		this.image = image;
		this.slice = slice;
		this.width = width;
	}
	
	public ImageBorder(Image image, Size width, Size slice, Size outset) {
		this.image = image;
		this.width = width;
		this.slice = slice;
		this.setOutset(outset);
	}
	
	public ImageBorder(Image image, Size width, Size slice, Size outsetVertical, Size outsetHorizontal) {
		this.image = image;
		this.width = width;
		this.slice = slice;
		this.setOutset(outsetVertical, outsetHorizontal);
	}
	
	public ImageBorder(Image image, Size width, Size slice, Size outsetTop, Size outsetHorizontal, Size outsetBottom) {
		this.image = image;
		this.width = width;
		this.slice = slice;
		this.setOutset(outsetTop, outsetHorizontal, outsetBottom);
	}
	
	public ImageBorder(Image image, Size width, Size slice, Size outsetTop, Size outsetRight, Size outsetBottom, Size outsetLeft) {
		this.image = image;
		this.width = width;
		this.slice = slice;
		this.outsetTop = outsetTop;
		this.outsetRight = outsetRight;
		this.outsetBottom = outsetBottom;
		this.outsetLeft = outsetLeft;
	}
	
	public ImageBorder(Image image, Size width, Size slice, Size outsetTop, Size outsetRight, Size outsetBottom, Size outsetLeft, ImageBorderRepeat repeat) {
		this.image = image;
		this.width = width;
		this.slice = slice;
		this.outsetTop = outsetTop;
		this.outsetRight = outsetRight;
		this.outsetBottom = outsetBottom;
		this.outsetLeft = outsetLeft;
		this.repeat = repeat;
	}
	
	public ImageBorder(Image image, ImageBorderRepeat repeat) {
		this.image = image;
		this.repeat = repeat;
	}
	
	public ImageBorder(Image image, Size width, ImageBorderRepeat repeat) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
	}
	
	public ImageBorder(Image image, Size width, ImageBorderRepeat repeat, Size outset) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
		this.setOutset(outset);
	}
	
	public ImageBorder(Image image, Size width, ImageBorderRepeat repeat, Size outsetVertical, Size outsetHorizontal) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
		this.setOutset(outsetVertical, outsetHorizontal);
	}
	
	public ImageBorder(Image image, Size width, ImageBorderRepeat repeat, Size outsetTop, Size outsetHorizontal, Size outsetBottom) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
		this.setOutset(outsetTop, outsetHorizontal, outsetBottom);
	}
	
	public ImageBorder(Image image, Size width, ImageBorderRepeat repeat, Size outsetTop, Size outsetRight, Size outsetBottom, Size outsetLeft) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
		this.setOutset(outsetTop, outsetRight, outsetBottom, outsetLeft);
	}
	
	public ImageBorder(Image image, ImageBorderRepeat repeat, Size width) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
	}
	
	public ImageBorder(Image image, ImageBorderRepeat repeat, Size width, Size outset) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
		this.setOutset(outset);
	}
	
	public ImageBorder(Image image, ImageBorderRepeat repeat, Size width, Size outsetVertical, Size outsetHorizontal) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
		this.setOutset(outsetVertical, outsetHorizontal);
	}
	
	public ImageBorder(Image image, ImageBorderRepeat repeat, Size width, Size outsetTop, Size outsetHorizontal, Size outsetBottom) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
		this.setOutset(outsetTop, outsetHorizontal, outsetBottom);
	}
	
	public ImageBorder(Image image, ImageBorderRepeat repeat, Size width, Size outsetTop, Size outsetRight, Size outsetBottom, Size outsetLeft) {
		this.image = image;
		this.width = width;
		this.repeat = repeat;
		this.setOutset(outsetTop, outsetRight, outsetBottom, outsetLeft);
	}
	
	public Image getImage() {
		return image;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	public Size getSlice() {
		return slice;
	}
	
	public void setSlice(Size slice) {
		this.slice = slice;
	}
	
	public Size getWidth() {
		return width;
	}
	
	public void setWidth(Size width) {
		this.width = width;
	}
	
	public void setOutset(Size all) {
		this.outsetTop = all;
		this.outsetRight = all;
		this.outsetBottom = all;
		this.outsetBottom = all;
	}
	
	public void setOutset(Size vertical, Size horizontal) {
		this.outsetTop = vertical;
		this.outsetBottom = vertical;
		this.outsetLeft = horizontal;
		this.outsetRight = horizontal;
	}
	
	public void setOutset(Size top, Size horizontal, Size bottom) {
		this.outsetTop = top;
		this.outsetRight = horizontal;
		this.outsetBottom = bottom;
		this.outsetLeft = horizontal;
	}
	
	public void setOutset(Size top, Size right, Size bottom, Size left) {
		this.outsetTop = top;
		this.outsetRight = right;
		this.outsetBottom = bottom;
		this.outsetLeft = left;
	}
	
	public Size getOutsetTop() {
		return outsetTop;
	}
	
	public void setOutsetTop(Size outsetTop) {
		this.outsetTop = outsetTop;
	}
	
	public Size getOutsetRight() {
		return outsetRight;
	}
	
	public void setOutsetRight(Size outsetRight) {
		this.outsetRight = outsetRight;
	}
	
	public Size getOutsetBottom() {
		return outsetBottom;
	}
	
	public void setOutsetBottom(Size outsetBottom) {
		this.outsetBottom = outsetBottom;
	}
	
	public Size getOutsetLeft() {
		return outsetLeft;
	}
	
	public void setOutsetLeft(Size outsetLeft) {
		this.outsetLeft = outsetLeft;
	}
	
	public ImageBorderRepeat getRepeat() {
		return repeat;
	}
	
	public void setRepeat(ImageBorderRepeat repeat) {
		this.repeat = repeat;
	}
	
	@Override
	public Runnable animate(ImageBorder to, Animation an) {
		return () -> {
			this.getWidth().animate(to.getWidth(), an).run();
			this.getSlice().animate(to.getSlice(), an).run();
			this.getOutsetTop().animate(to.getOutsetTop(), an).run();
			this.getOutsetRight().animate(to.getOutsetRight(), an).run();
			this.getOutsetBottom().animate(to.getOutsetBottom(), an).run();
			this.getOutsetLeft().animate(to.getOutsetLeft(), an).run();
		};
	}
}
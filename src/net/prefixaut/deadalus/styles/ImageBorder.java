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
	private Size width = new Size(0), slice = new Size(0), outset = new Size(0);
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
		this.outset(outset);
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
		this.outset(outset);
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
		this.outset(outset);
	}
	
	public Image image() {
		return image;
	}
	
	public void image(Image image) {
		this.image = image;
	}
	
	public Size slice() {
		return slice;
	}
	
	public void slice(Size slice) {
		this.slice = slice;
	}
	
	public Size width() {
		return width;
	}
	
	public void width(Size width) {
		this.width = width;
	}
	
	public Size outset() {
		return this.outset;
	}
	
	public void outset(Size outset) {
		this.outset = outset;
	}
	
	public void outset(double all) {
		this.outset(new Size(all));
	}
	
	public void outsetLeft(double left) {
		this.outset(new Size(left));
	}
	
	public ImageBorderRepeat repeat() {
		return repeat;
	}
	
	public void repeat(ImageBorderRepeat repeat) {
		this.repeat = repeat;
	}
	
	@Override
	public Runnable animate(ImageBorder to, Animation an) {
		return () -> {
			this.width().animate(to.width(), an).run();
			this.slice().animate(to.slice(), an).run();
			this.outset().animate(to.outset(), an).run();
		};
	}
	
	@Override
	public String css() {
		return /* TODO: SOURCE + " " + */ this.slice() + " " + this.width() + " " + this.outset() + " " + this.repeat();
	}
}
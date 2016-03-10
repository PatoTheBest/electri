package net.prefixaut.deadalus;

import java.util.Collection;
import java.util.List;

public interface Music extends Audio {
	
	public List<String> artists();
	public void artist(Collection<String> artists);
	
	public String album();
	public void album(String album);
	
	public Image trackCover();
	public void trackCover(Image cover);
	
	public Image albumCover();
	public void albumCover(Image cover);
}
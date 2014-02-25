package com.podts.stellarserver.listen;

import java.util.Collection;

public interface Listenable<E extends Listener> {
	
	public Collection<E> getListeners();
	
	public void addListener(E listener);
	public void removeListener(E listener);
	
}

package com.design.patterns.cbehavioral.aobserver;

import java.util.ArrayList;
import java.util.List;


public class YouTubeChannel implements Subject{

	private List<Observer> subscribers = new ArrayList<>();
	
	@Override
	public void subscribe(Observer o) {
		// TODO Auto-generated method stub
		subscribers.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		// TODO Auto-generated method stub
		subscribers.remove(o);
	}

	@Override
	public void notifyObservers(String message) {
		// TODO Auto-generated method stub
		for(Observer o : subscribers)
			o.update(message);
		
	}
	
	public void uploadPost(String tittle) {
		System.out.println("Post uploaded");
		notifyObservers("New post '"+tittle+"' uploaded please read it.");
	}

	public void uploadVideo(String tittle) {
		System.out.println("Video uploaded");
		notifyObservers("New video '"+tittle+"' uploaded please watch it.");
	}
}

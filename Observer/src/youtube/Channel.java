package youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable {
	
	private String name;
	private List<Observer> subscribers = new ArrayList<Observer>();
	private List<Video> videos = new ArrayList<Video>();
	
	public Channel(String name) {
		this.name = name;
	}

	@Override
	public void register(Observer subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void remove(Observer observer) {
		subscribers.remove(observer);
	}

	@Override
	public void notifyObservers(String videoDetails) {
		for (Observer observer : subscribers) {
			observer.update(videoDetails);
		}
	}
	
	public void upload(Video video) {
		videos.add(video);
		notifyObservers(video.getTitle()+" ("+video.getUploadDate()+")");
	}
	
	@Override
	public String toString() {
		return String.format("%s Channel: \nSubscribers:%s \nVideos:%s", name, subscribers, videos);
	}
	
	
}

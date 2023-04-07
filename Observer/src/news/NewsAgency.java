package news;

import java.util.HashSet;
import java.util.Set;

public class NewsAgency implements Observable{

	private Set<Observer> observersList;
	private String latestNews;
	
	public NewsAgency() {
		observersList = new HashSet<Observer>(); //lazy
	}
	
	public String getLatestNews() {
		return latestNews;
	}

	public void setLatestNews(String latestNews) {
		this.latestNews = latestNews;
		notifyObservers(latestNews);
	}

	@Override
	public void register(Observer observer) {
		observersList.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observersList.remove(observer);
	}

	@Override
	public void notifyObservers(String notification) {
		for (Observer observer : observersList) {
			observer.update(notification);
		}
	}

}

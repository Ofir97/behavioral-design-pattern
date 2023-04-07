package youtube;

public interface Observable {
	void register(Observer observer);
	void remove(Observer observer);
	void notifyObservers(String notification);
}

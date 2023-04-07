package youtube;

public class Subscriber implements Observer {
	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String videoTitle) {
		System.out.println("Hey " + name + ", Video " + videoTitle + " uploaded!");
	}
	
	@Override
	public String toString() {
		return name;
	}

}

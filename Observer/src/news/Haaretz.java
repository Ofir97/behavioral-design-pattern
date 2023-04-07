package news;

public class Haaretz implements Observer {

	@Override
	public void update(String notification) {
		if (confirmSource())
			publishArticle(notification);
	}
	
	private boolean confirmSource() {
		return true;
	}
	
	private void publishArticle(String notification) {
		System.out.println("Haaretz is publishing an article about: " + notification);
	}
	
}

package news;

public class Ynet implements Observer {

	@Override
	public void update(String notification) {
		System.out.println("Ynet is publishing an article about: " + notification);
	}

}

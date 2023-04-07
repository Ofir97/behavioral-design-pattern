package news;

public class TenseDays {
	public static void main(String[] args) {
		NewsAgency reuters = new NewsAgency();
		
		Ynet ynet = new Ynet();
		Haaretz haaretz = new Haaretz();
		
		reuters.register(ynet);
		reuters.register(haaretz);
		
		reuters.setLatestNews("Terror attack in central Berlin");
		
		System.out.println("---------------------------------------");
		
		reuters.remove(haaretz); // haaretz no longer receives updates from reuters.
		reuters.setLatestNews("4.8 magnitude earthquake near Cyprus");
		
	}
}

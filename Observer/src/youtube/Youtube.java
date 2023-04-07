package youtube;

import java.util.Calendar;

public class Youtube {
	public static void main(String[] args) {
		
		Channel teluskoChannel = new Channel("Telusko");

		Subscriber subscriber1 = new Subscriber("John");
		Subscriber subscriber2 = new Subscriber("Sam");
		Subscriber subscriber3 = new Subscriber("Bob");
		Subscriber subscriber4 = new Subscriber("Steve");

		teluskoChannel.register(subscriber1);
		teluskoChannel.register(subscriber2); 
		teluskoChannel.register(subscriber3);
		teluskoChannel.register(subscriber4);
		
		teluskoChannel.upload(new Video("Learn Basic Java", Calendar.getInstance().getTime()));
		teluskoChannel.remove(subscriber2);
		
		System.out.println("----------------------------------------");
		
		teluskoChannel.upload(new Video("Advanced Java", Calendar.getInstance().getTime()));
		
		System.out.println("----------------------------------------");
		
		System.out.println(teluskoChannel);
		
	}
}

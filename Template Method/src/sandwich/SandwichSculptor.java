package sandwich;

public class SandwichSculptor {

	public static void main(String[] args) {

		ItalianHoagie italianHoagie = new ItalianHoagie();
		italianHoagie.makeSandwich();

		System.out.println("---------------------------");

		VeggieHoagie veggieHoagie = new VeggieHoagie();
		veggieHoagie.makeSandwich();
	}


}

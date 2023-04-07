package items;

public class VisitorTest {

    public static void main(String[] args) {
        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println("--- TAX PRICES ---");
        System.out.println(milk.accept(taxCalc));
        System.out.println(vodka.accept(taxCalc));
        System.out.println(cigars.accept(taxCalc));

        System.out.println("\n--- TAX HOLIDAY PRICES ---");
        System.out.println(milk.accept(taxHolidayCalc));
        System.out.println(vodka.accept(taxHolidayCalc));
        System.out.println(cigars.accept(taxHolidayCalc));
    }
}

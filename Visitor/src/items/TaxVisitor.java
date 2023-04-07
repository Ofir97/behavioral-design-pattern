package items;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{

    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor() {}

    @Override
    public double visit(Liquor liquorItem) {
        System.out.print("Liquor Item: Price with Tax: ");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.print("Tobacco Item: Price with Tax: ");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.print("Necessity Item: Price with Tax: ");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }

}

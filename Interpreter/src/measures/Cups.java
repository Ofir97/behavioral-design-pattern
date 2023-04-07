package measures;

public class Cups extends Expression{
    @Override
    String gallons(double quantity) {
        return Double.toString(quantity/16);
    }

    @Override
    String quarts(double quantity) {
        return Double.toString(quantity/4);
    }

    @Override
    String pints(double quantity) {
        return Double.toString(quantity/2);
    }

    @Override
    String cups(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    String tablespoons(double quantity) {
        return Double.toString(quantity*16);
    }
}

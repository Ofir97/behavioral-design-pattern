package measures;

public class Quarts extends Expression {
    @Override
    String gallons(double quantity) {
        return Double.toString(quantity / 4);
    }

    @Override
    String quarts(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    String pints(double quantity) {
        return Double.toString(quantity * 2);
    }

    @Override
    String cups(double quantity) {
        return Double.toString(quantity * 4);
    }

    @Override
    String tablespoons(double quantity) {
        return Double.toString(quantity * 64);
    }
}

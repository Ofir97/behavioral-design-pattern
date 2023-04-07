package measures;

public class Pints extends Expression {
    @Override
    String gallons(double quantity) {
        return Double.toString(quantity / 8);
    }

    @Override
    String quarts(double quantity) {
        return Double.toString(quantity / 2);
    }

    @Override
    String pints(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    String cups(double quantity) {
        return Double.toString(quantity * 2);
    }

    @Override
    String tablespoons(double quantity) {
        return Double.toString(quantity * 32);
    }
}

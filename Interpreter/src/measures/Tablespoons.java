package measures;

public class Tablespoons extends Expression {
    @Override
    String gallons(double quantity) {
        return Double.toString(quantity / 256);
    }

    @Override
    String quarts(double quantity) {
        return Double.toString(quantity / 64);
    }

    @Override
    String pints(double quantity) {
        return Double.toString(quantity / 32);
    }

    @Override
    String cups(double quantity) {
        return Double.toString(quantity / 16);
    }

    @Override
    String tablespoons(double quantity) {
        return Double.toString(quantity);
    }
}

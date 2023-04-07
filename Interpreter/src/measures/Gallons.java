package measures;

public class Gallons extends Expression{
    @Override
    String gallons(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    String quarts(double quantity) {
        return Double.toString(quantity*4);
    }

    @Override
    String pints(double quantity) {
        return Double.toString(quantity*8);
    }

    @Override
    String cups(double quantity) {
        return Double.toString(quantity*16);
    }

    @Override
    String tablespoons(double quantity) {
        return Double.toString(quantity*256);
    }
}

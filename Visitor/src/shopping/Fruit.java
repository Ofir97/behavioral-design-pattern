package shopping;

public class Fruit implements Visitable {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int weight, String name) {
        this.pricePerKg = priceKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

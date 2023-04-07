package shopping;

public class Book implements Visitable {

    private int price;
    private String serialNumber;

    public Book(int cost, String serialNumber) {
        this.price = cost;
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

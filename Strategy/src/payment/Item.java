package payment;

public class Item {

    private String upcCode;
    private String name;
    private int price;

    public Item(String upc, String name, int cost) {
        this.upcCode = upc;
        this.name = name;
        this.price = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}

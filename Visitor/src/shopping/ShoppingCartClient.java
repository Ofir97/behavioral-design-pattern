package shopping;

public class ShoppingCartClient {

    public static void main(String[] args) {
        Visitable[] items = new Visitable[]{new Book(20, "1234"),
                new Book(100, "5678"), new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("\nTotal Cost = " + total);
    }

    private static int calculatePrice(Visitable[] items) {
        Visitor visitor = new ShoppingCartVisitor();
        int sum = 0;
        for (Visitable item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}

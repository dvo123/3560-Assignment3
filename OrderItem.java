
public class OrderItem {
    private int itemNumber;
    private Product product;
    private int quantity;

    public OrderItem(int itemNumber, Product product, int quantity) {
        this.itemNumber = itemNumber;
        this.product = product;
        this.quantity = quantity;
    }

    public double calculatePrice() {
        return quantity * product.getPrice();
    }
}
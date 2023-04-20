import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderNumber;
    private Date orderDate;
    private double orderTotalPrice;
    private Customer customer;
    private List<OrderItem> orderItems;

    public Order(int orderNumber, Date orderDate, Customer customer) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.customer = customer;
        this.orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.calculatePrice();
        }
        orderTotalPrice = total;
        return total;
    }
}

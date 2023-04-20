import java.util.Date;

public class Pizza extends Product {
    public enum PizzaSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    private PizzaSize size;
    
    public enum PizzaTopping {
        Pepperoni,
        Mozzarella
    }
    
    private PizzaTopping topping;

    public Pizza(String code, String description, double price, PizzaSize size, PizzaTopping topping) {
        super(code, description, price);
        this.size = size;
        this.topping = topping;
    }

    public PizzaSize getSize() {
        return size;
    }

    public PizzaTopping getTopping() {
        return topping;
    }

    @Override
    public double getPrice(Date date) {
        return getPrice();
    }
}
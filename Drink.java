import java.util.Date;

public class Drink extends Product {
    public enum DrinkType {
        DIET,
        REGULAR
    }
    
    private DrinkType type;
    
    public enum DrinkBrand {
        Coke,
        Sprite
    }

    private DrinkBrand brand;

    public Drink(String code, String description, double price, DrinkBrand brand, DrinkType type) {
        super(code, description, price);
        this.brand = brand;
        this.type = type;
    }

    public DrinkBrand getBrand() {
        return brand;
    }
    
    public DrinkType getType() {
        return type;
    }

    @Override
    public double getPrice(Date date) {
        return getPrice();
    }
}
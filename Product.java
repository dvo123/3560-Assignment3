import java.util.*;

public abstract class Product {
    private String code;
    private String description;
    private double price;

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public abstract double getPrice(Date date);
    
    public void addPrice(double price) {
    	this.price = price;
    }
}
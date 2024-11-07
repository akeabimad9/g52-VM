package se.lexicon;


public class Product3 extends Product {
    private String brand;

    public Product3(double price, String productName, String brand) {
        super(price, productName);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String examine() {
        return "Product3: " + getProductName() + ", Price: $" + getPrice() + ", Brand: " + brand;
    }

    @Override
    public String use() {
        return "Enjoy your " + brand + " " + getProductName() + "!";
    }
}


package se.lexicon;


public abstract class Product {
    private double price;
    private String productName;

    public Product(double price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public abstract String examine();
    public abstract String use();
}

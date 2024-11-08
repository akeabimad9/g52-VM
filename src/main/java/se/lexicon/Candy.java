package se.lexicon;


public class Candy extends Product {
    private String flavor;

    public Candy(double price, String productName, String flavor) {
        super(price, productName);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String examine() {
        return "Product1: " + getProductName() + ", Price: $" + getPrice() + ", Flavor: " + flavor;
    }

    @Override
    public String use() {
        return "Enjoy your " + flavor + " " + getProductName() + "!";
    }
}

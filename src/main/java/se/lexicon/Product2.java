package se.lexicon;

public class Product2 extends Product {
    private int calories;

    public Product2(double price, String productName, int calories) {
        super(price, productName);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String examine() {
        return "Product2: " + getProductName() + ", Price: $" + getPrice() + ", Calories: " + calories;
    }

    @Override
    public String use() {
        return "Enjoy your " + getProductName() + " with " + calories + " calories!";
    }
}

package se.lexicon;

public class Chips extends Product {
    private int calories;

    public Chips(double price, String productName, int calories) {
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


package se.lexicon;

import se.lexicon.Product;
import se.lexicon.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    private List<Product> products = new ArrayList<>();
    private int depositPool = 0;

    public VendingMachineImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public void addCurrency(int amount) {
        // Accepts only specific values
        if (amount == 1 || amount == 5 || amount == 10 || amount == 20 || amount == 50 || amount == 100 || amount == 500) {
            depositPool += amount;
        } else {
            System.out.println("Invalid currency amount.");
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        if (id >= 0 && id < products.size()) {
            Product product = products.get(id);
            if (depositPool >= product.getPrice()) {
                depositPool -= product.getPrice();
                return product;
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid product ID.");
        }
        return null;
    }

    @Override
    public int endSession() {
        int refund = depositPool;
        depositPool = 0;
        return refund;
    }

    @Override
    public String getDescription(int id) {
        if (id >= 0 && id < products.size()) {
            return products.get(id).examine();
        }
        return "Invalid product ID.";
    }

    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            productDescriptions[i] = i + ": " + product.getProductName() + " - $" + product.getPrice();
        }
        return productDescriptions;
    }
}

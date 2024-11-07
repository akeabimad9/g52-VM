package se.lexicon;


import se.lexicon.Product1;
import se.lexicon.Product2;
import se.lexicon.Product3;
import se.lexicon.VendingMachine;
import se.lexicon.VendingMachineImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product1 candy = new Product1(10, "Candy", "Strawberry");
        Product2 chips = new Product2(15, "Chips", 200);
        Product3 soda = new Product3(20, "Soda", "Coca-Cola");

        VendingMachine vendingMachine = new VendingMachineImpl(Arrays.asList(candy, chips, soda));

        System.out.println("Available products:");
        for (String product : vendingMachine.getProducts()) {
            System.out.println(product);
        }

        System.out.println("\nAdding currency: 20");
        vendingMachine.addCurrency(20);

        System.out.println("Requesting product with ID 1:");
        System.out.println(vendingMachine.request(1).use());

        System.out.println("Ending session, change returned: " + vendingMachine.endSession());
    }
}

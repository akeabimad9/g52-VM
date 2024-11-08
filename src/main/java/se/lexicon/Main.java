package se.lexicon;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy(10, "Candy", "Strawberry");
        Chips chips = new Chips(15, "Chips", 200);
        Soda soda = new Soda(20, "Soda", "Coca-Cola");

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

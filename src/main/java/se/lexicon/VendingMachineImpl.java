package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {

    private Product[] products;
    private int depositPool;

    // Constructor
    public VendingMachineImpl(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
        // Only accept specific values
        int[] validAmounts = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        for (int value : validAmounts) {
            if (amount == value) {
                depositPool += amount;
                return;
            }
        }
        System.out.println("Invalid amount. Please insert a valid denomination.");
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                    System.out.println("You bought: " + product.getProductName());
                    return product;
                } else {
                    System.out.println("Not enough money!");
                    return null;
                }
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    @Override
    public String endSession() {
        int change = depositPool;
        depositPool = 0;
        return "Returning change: " + change + " SEK";
    }

    @Override
    public String[] getProducts() {
        String[] productList = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            Product p = products[i];
            productList[i] = "ID: " + p.getId() + " | Name: " + p.getProductName() + " | Price: " + p.getPrice();
        }
        return productList;
    }
}

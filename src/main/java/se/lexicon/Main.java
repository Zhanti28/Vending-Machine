package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Coke(1, 15, "Coca Cola"),
                new ProteinShake(2, 25, "Arla Protein"),
                new CandyBar(3, 10, "Snickers")
        };

        VendingMachine machine = new VendingMachineImpl(products);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vending Machine!");

        boolean running = true;
        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1 - Add money");
            System.out.println("2 - Buy product");
            System.out.println("3 - Show balance");
            System.out.println("4 - Show products");
            System.out.println("5 - End session");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit (1,2,5,10,20,50,100,200,500,1000): ");
                    int amount = scanner.nextInt();
                    machine.addCurrency(amount);
                    System.out.println("Current balance: " + machine.getBalance() + " SEK");
                    break;

                case 2:
                    System.out.print("Enter the ID of the product you want to buy: ");
                    int productId = scanner.nextInt();
                    Product bought = machine.request(productId);
                    if (bought != null) {
                        System.out.println(bought.use());
                        System.out.println("Remaining balance: " + machine.getBalance() + " SEK");
                    }
                    break;

                case 3:
                    System.out.println("Current balance: " + machine.getBalance() + " SEK");
                    break;

                case 4:
                    System.out.println("Available products:");
                    for (String info : machine.getProducts()) {
                        System.out.println(info);
                    }
                    break;

                case 5:
                    System.out.println(machine.endSession());
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Thank you for using the vending machine!");
        scanner.close();
    }
}

package se.lexicon;

public interface VendingMachine {
    void addCurrency(int amount);
    int getBalance();
    Product request(int id);
    String endSession();
    String[] getProducts();
}

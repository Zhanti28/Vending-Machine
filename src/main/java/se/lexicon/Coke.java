package se.lexicon;

public final class Coke extends Product{

    private int id = 1;
    private double price = 15.00;
    private String productName = "Coca Cola";
    private final String flavore = "cherry";

    public Coke(int id, double price, String productName) {
        super(id, price, productName);
        this.setId(id);
        this.setPrice(price);
        this.setProductName(productName);
    }

    @Override
    public String examine() {
        return "Item ID; " + id + "\nPrice: " + price + "\nProduct Name: " + productName + "\nFlavore: " + flavore;
    }

    @Override
    public String use() {
        return "";
    }
}

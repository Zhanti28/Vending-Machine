package se.lexicon;

public class ProteinShake extends Product {

    private String flavor;

    public ProteinShake(int id, double price, String productName) {
        super(id, price, productName);
        this.flavor = "Strawberry";
    }

    @Override
    public String examine() {
        return "Item ID: " + getId() + "\nPrice: " + getPrice() +
                "\nProduct Name: " + getProductName() + "\nFlavor: " + flavor;
    }

    @Override
    public String use() {
        return "You drink the " + getProductName() + ". Great for muscle recovery!";
    }
}

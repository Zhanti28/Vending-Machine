package se.lexicon;

public final class Coke extends Product {

    private String flavor;

    public Coke(int id, double price, String productName) {
        super(id, price, productName);
        this.flavor = "Cherry";
    }

    @Override
    public String examine() {
        return "Item ID: " + getId() + "\nPrice: " + getPrice() +
                "\nProduct Name: " + getProductName() + "\nFlavor: " + flavor;
    }

    @Override
    public String use() {
        return "You drink the " + getProductName() + ". Refreshing!";
    }
}

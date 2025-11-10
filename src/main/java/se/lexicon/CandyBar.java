package se.lexicon;

public class CandyBar extends Product {

    private boolean hasChocolate;

    public CandyBar(int id, double price, String productName) {
        super(id, price, productName);
        this.hasChocolate = true;
    }

    @Override
    public String examine() {
        return "Item ID: " + getId() + "\nPrice: " + getPrice() +
                "\nProduct Name: " + getProductName() + "\nHas Chocolate: " + hasChocolate;
    }

    @Override
    public String use() {
        return "You eat the " + getProductName() + ". Sweet and satisfying!";
    }
}

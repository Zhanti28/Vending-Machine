package se.lexicon;

public class ProteinShake extends Product {

    private String flavore = "chocolate";

    public ProteinShake(int id, double price, String productName) {
        super(id, price, productName);
    }

    @Override
    public String examine() {
        return "";
    }

    @Override
    public String use() {
        return "";
    }
}

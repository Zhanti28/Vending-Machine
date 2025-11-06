package se.lexicon;

public class CandyBar extends Product {

    private boolean haschocolet = true;



    public CandyBar(int id, double price, String productName) {
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

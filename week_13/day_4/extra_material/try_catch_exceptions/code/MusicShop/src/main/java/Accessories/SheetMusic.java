package Accessories;

public class SheetMusic extends Accessory {

    public SheetMusic(String name, double buyingCost, double sellingPrice) {
        super(name, buyingCost, sellingPrice);
    }

    public double calculateMarkup() {
        return 15;
    }
}

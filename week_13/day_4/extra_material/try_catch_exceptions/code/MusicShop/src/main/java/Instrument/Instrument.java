package Instrument;

public class Instrument {

    private String material;
    private String colour;
    private String type;
    private double buyingCost;
    private double sellingPrice;

    public Instrument(String material, String colour, String type, double buyingCost, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getBuyingCost() {
        return buyingCost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        double difference = getSellingPrice() - getBuyingCost();
        return difference;
    }
}

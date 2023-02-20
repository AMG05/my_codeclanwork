package Accessories;

public class Accessory {

    private String name;
    private double buyingCost;
    private double sellingPrice;

    public Accessory(String name, double buyingCost, double sellingPrice) {
        this.name = name;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public double getBuyingCost() {
        return buyingCost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculation(){
        double difference=getSellingPrice() - getBuyingCost();
                return difference;
    }
}

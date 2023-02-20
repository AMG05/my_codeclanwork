package Instrument;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {
    private int numberOfStrings;
    private String effectsPedal;


    public Guitar(String material, String colour, String type, double buyingCost, double sellingPrice) {
        super(material, colour, type, buyingCost, sellingPrice);
        this.numberOfStrings = numberOfStrings;
        this.effectsPedal = effectsPedal;


    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getEffectsPedal() {
        return effectsPedal;
    }


    public String play() {
        return "Twang";
    }
}

package Instrument;

import Behaviours.IPlay;

    public class Saxophone extends Instrument implements IPlay {
        private String size;

        public Saxophone(String material, String colour, String type, double buyingCost, double sellingPrice) {
            super(material, colour, type, buyingCost, sellingPrice);
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public String play() {
            return "Hawh";
        }

}

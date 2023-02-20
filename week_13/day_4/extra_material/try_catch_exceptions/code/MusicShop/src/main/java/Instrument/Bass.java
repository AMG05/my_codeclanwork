package Instrument;

import Behaviours.IPlay;

        public class Bass extends Instrument implements IPlay {
        private int numberOfStrings;


        public Bass(String material, String colour, String type, double buyingCost, double sellingPrice) {
            super(material, colour, type, buyingCost, sellingPrice);
            this.numberOfStrings = numberOfStrings;

        }

        public int getNumberOfStrings() {
            return numberOfStrings;
        }


        public String play() {
            return "Twong";
        }

}

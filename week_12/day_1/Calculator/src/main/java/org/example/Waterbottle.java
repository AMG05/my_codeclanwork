package org.example;

    public class WaterBottle {

        private double volume;

        public WaterBottle(){
            this.volume = 100.00;
        }

        public double getVolume() {
            return this.volume;
        }

        public void drink() {
            this.volume -= 10;
        }

        public void empty() {
            this.volume = 0.00;
        }

        public void fill() {
            this.volume = 100.00;
        }
    }
}

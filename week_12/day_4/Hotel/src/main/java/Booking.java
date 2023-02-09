public class Booking {
    private int numberOfNights;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int numberOfNights) {
        this.numberOfNights = numberOfNights;
        this.bedroom = bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getBill() {
        return this.numberOfNights * this.bedroom.getNightlyRate();
    }
}

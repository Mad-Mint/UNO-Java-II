public class Table extends Furniture {
    private int seats;

    public Table(String productName, int productNumber, int seat) {
        super(productName, productNumber);
        this.setSeats(seat);
    }

    private void setSeats(int seats) {
        if (seats >= 1) {
            this.seats = seats;
        } else {
            this.seats = 1;
        }
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return super.toString() + ", Table Seats: " + seats;
    }
}

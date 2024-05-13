class SUV extends Vehicle {
    private int numSeats;

    public SUV(String make, String model, int year, int mileage, double dailyRate, int numSeats) {
        super(make, model, year, mileage, dailyRate);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + numSeats + " seats";
    }
}

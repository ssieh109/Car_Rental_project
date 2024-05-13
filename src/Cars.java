class Cars extends Vehicle {
    private int doors;

    public Cars(String make, String model, int year, int mileage, double dailyRate, int numDoors) {
        super(make, model, year, mileage, dailyRate);
        this.doors = doors;
    }

    public Cars(String make, String model, int year, int mileage, double dailyRate) {
        super(make, model, year, mileage, dailyRate);
    }

    public int getNumDoors() {
        return doors;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + doors + " doors";
    }
}

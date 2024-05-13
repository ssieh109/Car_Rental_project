class Vehicle {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private double dailyRate;

    public Vehicle(String make, String model, int year, int mileage, double dailyRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.dailyRate = dailyRate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public String getDescription() {
        return year + " " + make + " " + model;
    }

    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }
}

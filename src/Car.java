// Car class representing a car for rent
public class Car {
    private String model;
    private double price;

    // Constructor to initialize model and price
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Getter methods for model and price
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    // toString method to display car information
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

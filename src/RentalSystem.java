 public class RentalSystem {
        private Car[] cars;

        // Constructor to initialize cars array
        public RentalSystem() {
            // Initialize cars with sample data
            cars = new Car[]{
                    new Car("Toyota", 50.0),
                    new Car("Honda", 60.0),
                    new Car("Ford", 70.0)
            };
        }

        // Method to display available cars
        public void displayAvailableCars() {
            System.out.println("Available Cars:");
            for (Car car : cars) {
                System.out.println(car);
            }
        }

        // Method to rent a car
        public void rentCar(String model) {
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(model)) {
                    System.out.println("You have rented: " + car);
                    return;
                }
            }
            System.out.println("Car not found.");
        }

        // Method overloading example
        public void rentCar(String model, int days) {
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(model)) {
                    double totalPrice = car.getPrice() * days;
                    System.out.println("You have rented: " + car + " for " + days + " days. Total price: $" + totalPrice);
                    return;
                }
            }
            System.out.println("Car not found.");
        }
    }


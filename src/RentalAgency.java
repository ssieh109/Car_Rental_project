
import java.util.ArrayList;
import java.util.List;
class RentalAgency {
    public List<Vehicle> availableVehicles;

    public RentalAgency() {
        availableVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    public Rental rentVehicle(Customer customer, int vehicleIndex, int days) {
        if (vehicleIndex >= 0 && vehicleIndex < availableVehicles.size()) {
            Vehicle vehicle = availableVehicles.remove(vehicleIndex);
            return new Rental(customer, vehicle, days);
        } else {
            return null;
        }
    }
}

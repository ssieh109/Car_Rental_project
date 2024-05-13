import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

        RentalAgency agency = new RentalAgency();
        agency.addVehicle(new Cars("Toyota", "Camry", 2020, 20000, 50, 4));
        agency.addVehicle(new Cars("Ford", "Fusion", 2019, 15000, 60, 4));


        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name? ");
        String name = sc.nextLine();
        System.out.println("Enter your license number: ");
        String licNum = sc.nextLine();
        Customer customer = new Customer(name, licNum);

        System.out.println("Available vehicles:");
        for (int i = 0; i < agency.availableVehicles.size(); i++) {
            System.out.println(i + ". " + agency.availableVehicles.get(i).getDescription());
        }
        System.out.println("Enter the number of the vehicle you want to rent:");
        int vehicleIndex = sc.nextInt();
        System.out.println("Enter the number of days you want to rent the vehicle for:");
        int days = sc.nextInt();

        Rental rental = agency.rentVehicle(customer, vehicleIndex, days);
        if (rental != null) {
            System.out.println("Rental details:");
            System.out.println("Vehicle: " + rental.getVehicle().getDescription());
            System.out.println("Total cost: $" + rental.calculateTotalCost());
        } else {
            System.out.println("Sorry, the selected vehicle is not available.");
        }

    }
}

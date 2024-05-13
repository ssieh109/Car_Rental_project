 class Rental {
     private Customer customer;
     private Vehicle vehicle;
     private int days;

     public Rental(Customer customer, Vehicle vehicle, int days) {
         this.customer = customer;
         this.vehicle = vehicle;
         this.days = days;
     }

     // Getters and setters

     public double calculateTotalCost() {
         return vehicle.calculateRentalCost(days);
     }

     public Vehicle getVehicle() {
         return vehicle;
     }

     public int getDays() {
         return days;
     }
 }

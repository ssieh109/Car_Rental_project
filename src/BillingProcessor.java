class BillingProcessor {
    private static final double TAX_RATE = 0.06;

    public static double calculateFinalBill(Rental rental) {
        double baseCost = rental.calculateTotalCost();
        double taxAmount = baseCost * TAX_RATE;
        return baseCost + taxAmount;
    }
    public static void printBill(Rental rental) {
        double baseCost = rental.calculateTotalCost();
        double taxAmount = baseCost * TAX_RATE;
        double finalAmount = baseCost + taxAmount;

        System.out.println("Rental Bill Receipt");
        System.out.println("===================");
        System.out.println("Vehicle Rented: " + rental.getVehicle().getDescription());
        System.out.println("Rental Days: " + rental.getDays());
        System.out.println("Base Cost: $" + String.format("%.2f", baseCost));
        System.out.println("Tax (" + (TAX_RATE * 100) + "%): $" + String.format("%.2f", taxAmount));
        System.out.println("Total Cost: $" + String.format("%.2f", finalAmount));
    }

    public static boolean processPayment(double amount) {
        System.out.println("Processing payment for $" + String.format("%.2f", amount) + "...");
        System.out.println("Payment successful!");
        return true;
    }
}

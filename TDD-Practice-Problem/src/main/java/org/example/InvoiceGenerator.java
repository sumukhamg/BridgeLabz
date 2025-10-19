package org.example;

public class InvoiceGenerator {
    private final int normalMinPrice = 25;
    private final int premiumMinimumPrice = 40;

    public double calculateFare(CabRides... rides){
        if (rides == null) {
            throw new IllegalArgumentException("Ride cannot be null");
        }
        double fare = 0;
        for (CabRides ride : rides) {
            if (ride.getDistance() < 0 || ride.getTime() < 0) {
                throw new IllegalArgumentException("Distance and time must be non-negative");
            }
            fare += (ride.getRideType().equalsIgnoreCase("Premium")) ? Math.max(((ride.getDistance() + ride.getTime()) * 15), premiumMinimumPrice) : Math.max(((ride.getDistance() + ride.getTime()) * 10), normalMinPrice);
        }
        return fare;
    }

    public Invoice getInvoice(CabRides[] rides) {
        if (rides == null || rides.length == 0) {
            throw new IllegalArgumentException("No rides found");
        }
        int totalFare = 0;
        for (CabRides ride : rides) {
            totalFare += calculateFare(ride);
        }
        return new Invoice(rides.length, totalFare);
    }
}

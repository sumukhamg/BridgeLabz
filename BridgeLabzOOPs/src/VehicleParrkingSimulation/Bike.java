package VehicleParrkingSimulation;

public class Bike implements Vehicle {
    private static int charges = 0;

    Bike() {
        charges += 20;
    }

    public int getCharges() {
        return charges;
    }

    public int parkingCharge() {
        return charges;
    }
}

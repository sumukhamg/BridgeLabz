public class Truck implements Vehicle {
    private static int charges = 0;

    Truck() {
        charges += 100;
    }

    public int getCharges() {
        return charges;
    }

    public int parkingCharge() {
        return charges;
    }
}
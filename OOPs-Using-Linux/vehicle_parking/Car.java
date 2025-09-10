public class Car implements Vehicle {
    private static int charges = 0;

    Car() {
        charges += 50;
    }

    public int getCharges() {
        return charges;
    }

    public int parkingCharge() {
        return charges;
    }
}

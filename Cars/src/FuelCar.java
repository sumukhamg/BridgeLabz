public class FuelCar implements Car {
    double fuel;

    FuelCar(double fuel) {
        this.fuel = fuel;
    }

    public void drive(double hours) {
        if (hours < 0)
            System.out.println("Invalid Error");

        else if (fuel - hours / 6 > fuel) {
            System.out.println("Fuel is not sufficient. Please fill your tank.");
        } else {
            fuel = fuel - hours / 3;
            System.out.println("Drew " + hours + " Hours");
            System.out.println("Fuel left: " + fuel);
        }
    }
}

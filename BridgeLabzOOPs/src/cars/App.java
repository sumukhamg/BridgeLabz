package cars;

public class App {
    public static void main(String[] args) throws Exception {
        Car electricCar = new ElectricCar(10);
        Car fuelCar = new FuelCar(100);

        electricCar.drive(10);
        fuelCar.drive(20);

    }
}

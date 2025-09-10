public class App {
    public static void main(String[] args) throws Exception {
        Car ec = new ElectricCar(10);
        Car fc = new FuelCar(100);

        ec.drive(10);

    }
}

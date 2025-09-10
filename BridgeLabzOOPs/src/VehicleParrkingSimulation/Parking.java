package VehicleParrkingSimulation;

public class Parking {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
        Bike bike3 = new Bike();

        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();

        Vehicle[] vehicle = { car1, car2, car3, car4, bike1, bike2, bike3, truck1, truck2, truck3 };

        int totalRevenue = car1.parkingCharge() + truck1.parkingCharge() + bike1.parkingCharge();

        System.out.println("Total parking capacity: " + vehicle.length);
        System.out.println("Total Revenue earned: " + totalRevenue);

    }

}

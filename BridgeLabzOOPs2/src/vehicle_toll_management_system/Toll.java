package vehicle_toll_management_system;

public class Toll {
    public static void main(String[] args) {
        Car car1 = new Car("KA 05 A 1234");
        Car car2 = new Car("KA 06 B 2940");
        Car car3 = new Car("KA 07 C 7854");
        Car car4 = new Car("KA 08 D 1236");

        Bike bike1 = new Bike("KA 09 E 4587");
        Bike bike2 = new Bike("KA 10 F 4583");
        Bike bike3 = new Bike("KA 11 G 4123");

        Truck truck1 = new Truck("AP 01 H 1258");
        Truck truck2 = new Truck("AP 02 I 4597");
        Truck truck3 = new Truck("AP 03 H 1265");

        Vehicle[] vehicle = { car1, car2, car3, car4, bike1, bike2, bike3, truck1, truck2, truck3 };

        int totalRevenue = car1.getTollAmount() + truck1.getTollAmount() + bike1.getTollAmount();

        System.out.println("Total parking capacity: " + vehicle.length);
        System.out.println("Total Revenue earned: " + totalRevenue);

    }

}

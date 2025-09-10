public class ElectricCar implements Car {
    double capacity;

    ElectricCar(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public void drive(double hours) {
        if (hours <= 0)
            System.out.println("Invalid Hours ebntered");
        else if (capacity - hours / 6 > capacity) {
            System.out.println("Low battery. Plaese recharge your battery");
        } else {
            capacity = capacity - hours / 6;
            System.out.println("Drew successfully. Battery remaining: " + capacity);
        }

    }

}

public class Main{
	public static void main(String args[]){
		Cars electricCar1 = new ElectricCars(10);
		Cars fuelCar1 = new FuelCars(20);
		electricCar1.drive(20);
		fuelCar1.drive(5);
	}
}

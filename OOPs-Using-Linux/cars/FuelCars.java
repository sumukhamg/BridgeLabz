public class FuelCars implements Cars{
	int fuel;
	FuelCars(int fuel){
		this.fuel = fuel;
	}

	 public void drive(int hours){
		if(hours < 0)
			System.out.println("Invalid hours entered");
		else if(fuel - hours / 6 > fuel)		
			System.out.println("Low Fuel");
		else{
			fuel = fuel - hours / 6;
			System.out.println("Successfully driven for " + hours + " hours. Fuel left: " + fuel);
		}
	}
}

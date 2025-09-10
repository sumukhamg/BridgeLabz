public class ElectricCars implements Cars{
	double capacity;
	ElectricCars(double capacity){
		this.capacity = capacity;
	}

	@Override
	public void drive(int hours){
		if(hours <= 0){
			System.out.println("Invalid Hours");
		}
		else if(capacity - hours / 6 > capacity){
			System.out.println("Low battery. Please recharge your battery");
		}
		else {
			capacity = capacity - hours / 6;
			System.out.println("Successfully drew for " + hours + " hours " + "battery remaining" + capacity);
		}
	}
}

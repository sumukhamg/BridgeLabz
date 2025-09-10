package vehicle_toll_management_system;

public class Truck implements Vehicle {
    private static int tollAmount = 0;
    private String plateNo;

    Truck(String plateNo) {
        this.plateNo = plateNo;
        tollAmount += 100;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public int getTollAmount() {
        return tollAmount;
    }
}
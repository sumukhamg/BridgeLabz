package vehicle_toll_management_system;

public class Bike implements Vehicle {
    private static int tollAmount = 0;
    private String plateNo;

    public String getPlateNo() {
        return plateNo;
    }

    Bike(String plateNo) {
        this.plateNo = plateNo;
        tollAmount += 20;
    }

    public int getTollAmount() {
        return tollAmount;
    }
}

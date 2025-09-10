package vehicle_toll_management_system;

public class Car implements Vehicle {
    private static int tollAmount = 0;
    private String plateNo;

    Car(String plateNo) {
        this.plateNo = plateNo;
        tollAmount += 50;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public int getTollAmount() {
        return tollAmount;
    }
}

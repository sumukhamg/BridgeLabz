package org.bridge;

public class CabRides {
    private int distance;
    private int time;

    private String rideType;


    public CabRides(int distance, int time, String rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }


    public int getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public String getRideType() {
        return rideType;
    }
}

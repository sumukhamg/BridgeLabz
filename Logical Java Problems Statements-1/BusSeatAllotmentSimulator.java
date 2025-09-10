import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BusSeatAllotmentSimulator {
    public static void main(String[] args) {
        int[] seats = { 3, 5, 12, 5, 11 };
        getAllotment(seats);
    }

    static void getAllotment(int[] x) {
        String[] booking = new String[x.length];
        List<Integer> seat = new ArrayList<>();
        for (int i = 0; i < booking.length; i++) {
            if (seat.contains(x[i])) {
                booking[i] = "Already Booked";
            } else {
                seat.add(x[i]);
                booking[i] = "Booked";
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println("Seat " + x[i] + " " + booking[i]);
        }
    }
}

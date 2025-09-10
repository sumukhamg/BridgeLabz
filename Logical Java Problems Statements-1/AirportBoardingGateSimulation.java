public class AirportBoardingGateSimulation {
    public static void main(String args[]) {
        int[] arr = { 101, 103, 102, 104 };
        int res = checkOrder(arr);

        System.out.println("total passangers swapped: " + res);
    }

    static int checkOrder(int[] arr) {
        int id = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (id != arr[i])
                count++;
            id++;
        }
        return count - 1;
    }
}

public class SecondHighestNumberWithoutSorting {
    public static void main(String args[]) {
        int[] arr = { 3, 1, 4, 4, 5, 5, 2, 6, 7, 7, 9, 11 };
        int max = 0;
        int smax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // 3 > 0 // 4 > 3 // 4 > 4 // 5 > 4
                // if (max > smax) // 4 > 4
                smax = max; // 0 // 3 // --- //
                max = arr[i]; // 5

            } else if (arr[i] > smax && arr[i] < max) { // 1 > 0 && 1 < 3 // 4 > 3 && 4 < 5
                smax = arr[i]; // 1 // 4
            }
        }

        System.out.println(max + " " + smax);
    }
}

import java.util.Arrays;

public class TeamAssignmentGame {
    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40 };
        Arrays.sort(arr);
        int[] teamA = new int[arr.length / 2];
        int[] teamB = new int[arr.length / 2];
        int sumA = 0, sumB = 0;
        int j = 0, k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sumA <= sumB) {
                teamA[j++] = arr[i];
                sumA += arr[i];
            }

            else {
                teamB[k++] = arr[i];
                sumB += arr[i];

            }

        }

        System.out.println(Arrays.toString(teamA));
        System.out.println(Arrays.toString(teamB));
    }

}

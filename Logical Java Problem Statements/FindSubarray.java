import java.util.Arrays;

public class FindSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 5 };
        int sum = 12;
        System.out.println(Arrays.toString(getSubArray(arr, sum)));

    }

    static int[] getSubArray(int[] arr, int sum) {
        int tsum = 0;
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (tsum < sum) {
                tsum += arr[i];
                end = i;
            } else if (tsum > sum) {N
                tsum -= arr[start];
                start++;
                end = i;
            } else if (tsum == sum) {
                end = i;
                break;
            }
        }

        if (tsum != sum) {
            return new int[0];
        }

        int[] subArray = new int[end - start];
        int k = 0;

        for (int i = start; i < end; i++) {
            subArray[k++] = arr[i];
        }

        return subArray;
    }
}

public class FindMissingNumberInAP {
    public static void main(String args[]) {
        int[] AP = { 0, 4, 8, 16, 20 };
        int missing = getMissingElement(AP);
        System.out.println("Missing element is: " + missing);
    }

    static int getMissingElement(int[] x) {
        if (x.length <= 0)
            return 0;
        else if (x.length <= 1)
            return x[0];
        int d = x[1] - x[0];
        // int ele = 0;

        for (int i = 0; i < x.length - 1; i++) {
            if (x[i + 1] - x[i] != d)
                return x[i] + d;
        }
        return 0;

    }
}

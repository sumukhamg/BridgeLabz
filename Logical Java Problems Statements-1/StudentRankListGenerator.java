import java.util.Arrays;

public class StudentRankListGenerator {
    public static void main(String args[]) {
        int marks[] = { 10, 80, 60 };
        marks = getDescendingMarks(marks);

        System.out.println(Arrays.toString(marks));
    }

    static int[] getDescendingMarks(int[] x) {
        Arrays.sort(x);
        int[] newMarks = new int[x.length];
        for (int i = 0, j = x.length - 1; i < newMarks.length; i++, j--) {
            newMarks[j] = x[i];
        }

        return newMarks;
    }
}

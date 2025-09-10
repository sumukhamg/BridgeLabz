public class ExamHallSeatValidator {
    public static void main(String[] args) {
        int[] id = { 21, 34, 44, 52 };
        validateIds(id);
    }

    static void validateIds(int[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] % 10 == x[i + 1] % 10)
                System.out.println("Invalid - " + x[i] + " and " + x[i + 1] + " have same last digit");
        }
    }
}

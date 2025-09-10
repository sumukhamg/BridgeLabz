import java.util.Arrays;
import java.util.stream.IntStream;

public class Print1To100Streams {
    public static void main(String args[]) {

        int[] arr = new int[100];

        IntStream.range(0, arr.length)
                .forEach(i -> System.out.println(i + 1));
    }
}
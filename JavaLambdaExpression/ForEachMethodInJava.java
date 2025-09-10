import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ForEachMethodInJava {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> iterate = list.iterator();
        while (iterate.hasNext())
            System.out.println("Values of list: " + iterate.next());

        // Using InnerClass
        System.out.println("using Inner class: ");
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer i) {
                System.out.println("List valuse: " + i);
            }
        }
        MyConsumer action = new MyConsumer();
        list.forEach(action);

        // Using anonymous Inner class:
        System.out.println("Using Anonymous inner class");
        list.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("List values: " + t);
            }
        });

        // Ussing implicit lambda function
        System.out.println("Using implicit lambda expression");
        Consumer<Integer> elements = t -> System.out.println("forEach valuse: " + t);
        list.forEach(elements);

        // Implicit lambda value for printing double value
        System.out.println("Implicit lambda value for printing double value");
        Function<Integer, Double> toDoubleValue = Integer::doubleValue;
        list.forEach(
                n -> System.out.println("Double value converted: " + toDoubleValue.apply(n))

        );

        // Usage of Prediacte interface
        System.out.println("Showing usage of Predicate Functional Interface: ");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        list.forEach(
                n -> System.out.println("Boolean value: " + n + " " + isEven.test(n)));
    }
}

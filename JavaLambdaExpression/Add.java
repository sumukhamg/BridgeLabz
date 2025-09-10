public class Add {

    public static void main(String[] args) {
        // IMathFunction add = (int a, int b) -> a + b;
        IMathFunction add = Integer::sum;
        System.out.println(add);

        IMathFunction multiply = (a, b) -> a * b;

        System.out.println("Addition using Lambda Expression: " + add.calculate(10, 20));
        System.out.println("Multiplication using Lambda expression: " + multiply.calculate(10, 20));

    }

}

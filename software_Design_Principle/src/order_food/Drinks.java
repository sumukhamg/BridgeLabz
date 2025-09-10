package order_food;

public class Drinks implements Food {

    @Override
    public void prepareFood() {
        System.out.println("Preparing Pizza");
    }
}

package order_food;

public class FoodFactory {
    public static Food getFood(String food) {
        if (food.equals("Pizza")) {
            return new Pizza();
        } else if (food.equals("Burger")) {
            return new Burger();
        } else if (food.equals("Burger")) {
            return new Burger();
        } else {
            System.out.println("Invalid input");
            return null;
        }

    }
}

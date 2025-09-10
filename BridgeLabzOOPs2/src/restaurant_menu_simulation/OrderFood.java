package restaurant_menu_simulation;

import java.util.Scanner;

public class OrderFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FoodItem food = null;

        System.out.println("----Menu----");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Paste");
        System.out.println("4. Exit Menu");
        System.out.println("Make a choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Which pizza you want to order: ");
                System.out.println("1. Margherita Pizza");
                System.out.println("2. Pepperoni Pizza");
                System.out.println("3. BBQ Chicken Pizza");
                int pizzaChoice = sc.nextInt();
                switch (pizzaChoice) {
                    case 1:
                        food = new Pizza(100, 60, "Dough, Tomato sauce, Fresh mozzarella");
                        food.orderFood();
                        break;

                    case 2:
                        food = new Pizza(150, 45, "Pizza dough, Tomato sauce, Mozzarella cheese");
                        food.orderFood();
                        break;
                    case 3:
                        food = new Pizza(200, 75,
                                "Pizza dough, BBQ sauce (instead of tomato sauce), Cooked chicken breast (shredded)");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        return;
                }
                break;

            case 2:
                System.out.println("Which Burger you want to order: ");
                System.out.println("1. Classic Cheeseburger");
                System.out.println("2. Veggie Burger");
                System.out.println("3. Chicken Burger");
                int burgerChoice = sc.nextInt();
                switch (burgerChoice) {
                    case 1:
                        food = new Burger(100, 60, "Dough, Tomato sauce, Fresh mozzarella");
                        food.orderFood();
                        break;

                    case 2:
                        food = new Burger(150, 45, "Burger dough, Tomato sauce, Mozzarella cheese");
                        food.orderFood();
                        break;

                    case 3:
                        food = new Burger(200, 75,
                                "Burger dough, BBQ sauce (instead of tomato sauce), Cooked chicken breast (shredded)");
                        food.orderFood();
                        break;

                    default:
                        System.out.println("Invalid choice");
                        return;
                }
                break;

            case 3:
                System.out.println("Which pizza yoou want to order: ");
                System.out.println("1. Spaghetti Aglio e Olio");
                System.out.println("2. Spaghetti Bolognese");
                System.out.println("3. Penne Arrabbiata");
                int pastaChoice = sc.nextInt();
                switch (pastaChoice) {
                    case 1:
                        food = new Pasta(100, 60, "Spaghetti, Olive oil, Garlic (sliced or minced)");
                        food.orderFood();
                        break;

                    case 2:
                        food = new Pasta(170, 35, "Spaghetti, Ground pork, Onion, Garlic");
                        food.orderFood();
                        break;

                    case 3:
                        food = new Pasta(250, 90,
                                "Penne pasta, Garlic, Red chili flakes, Olive oil");
                        food.orderFood();
                        break;

                    default:
                        System.out.println("Invalid choice");
                        return;
                }
                break;

            case 4:
                System.out.println("Exiting Menu");
                return;

            default:
                System.out.println("invalid Choice");
                return;

        }

    }
}

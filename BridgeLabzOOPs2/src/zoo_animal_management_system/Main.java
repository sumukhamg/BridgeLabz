package zoo_animal_management_system;

public class Main {
    public static void main(String[] args) {
        Elephant elephant1 = new Elephant();
        Elephant elephant2 = new Elephant();

        Lion lion1 = new Lion();

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        elephant1.setHealth(true);
        elephant1.sleep();
        elephant1.eat();
        elephant1.makeSound();

        lion1.setHealth(false);
        System.out.println(lion1.healthStatus());

    }
}

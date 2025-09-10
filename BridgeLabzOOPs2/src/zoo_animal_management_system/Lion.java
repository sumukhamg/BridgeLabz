package zoo_animal_management_system;

public class Lion extends Animal {

    private boolean health;

    public void setHealth(boolean health) {
        this.health = health;
    }

    public String healthStatus() {
        if (health) {
            return "Animal is Healthy";
        } else {
            return "Animal is not healthy";
        }
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars");
    }

    @Override
    public void eat() {
        System.out.println("Lion hunts and eat");
    }

}

package restaurant_menu_simulation;

public class Pasta implements FoodItem {

    private int price;
    private int cookingTime;
    private String ingridients;

    Pasta(int price, int cookingTime, String ingridients) {
        this.price = price;
        this.cookingTime = cookingTime;
        this.ingridients = ingridients;
    }

    public int getPrice() {
        return price;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getIngridients() {
        return ingridients;
    }

    @Override
    public void orderFood() {
        System.out.println("Your pasta will be ready in: " + getCookingTime());
        System.out.println("Ingridients used: " + getIngridients());
        System.out.println("Price: " + getPrice());
    }

}

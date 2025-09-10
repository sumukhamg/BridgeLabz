package org.example;

public class Item {
    private int id;
    private String name;
    private int price;

    public Item(int id, String name, int price){

        if(id <= 0)
            throw new RuntimeException("id cannot be less than 0");
        if(price <= 0)
            throw new RuntimeException("Price cannot be less than 0");
        if(name == null || name == "")
            throw new RuntimeException("Invalid name");
        this.id = id;
        this.name = name;
        this.price = price;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    void setName(String name){
        this.name = name;
    }

    private void setPrice(int price){
        this.price = price;
    }

    void updatePrice(int price) {
        if(price < 0)
            throw new RuntimeException("Item price cannot be less than 0");
        this.setPrice(price);
    }

    void updateName(String name){
        if(name == null  || name == "")
            throw new RuntimeException("Item name invalid");
        this.setName(name);
    }



}

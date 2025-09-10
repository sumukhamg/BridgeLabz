package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    Map<Integer, Item> cartItems = new HashMap<Integer, Item>();

    public Map<Integer, Item> addItems(Item... items){
        if(items == null)
            throw new RuntimeException("Items cannot be null");
        if(items.length <= 0)
            throw new RuntimeException("empty items");

        for(Item item : items){
            if(cartItems.containsKey( item.getId() ))
                    throw new RuntimeException("Item with id " + item.getId() + " already exist");
            else
                cartItems.put(item.getId(), item);
        }

        return cartItems;
    }

    public int removeItem(int id){
        if(cartItems.size() == 0)
            throw new RuntimeException("No items in cart");
        for(Item item : cartItems.values()){
            if(item.getId() == id){
                cartItems.remove(id);
                return id;
            }

        }
        throw new RuntimeException("No items found with id " + id);
    }

    public Map<Integer, Item> viewCartitems(){
        if(cartItems.size() == 0){
            System.out.println("cart is empty");
            return null;
        }
        for(Item item : cartItems.values()){
              System.out.println("Id: " + item.getId() + "\nItem name: " + item.getName() + "\nItem price: " + item.getPrice());
        }

        return cartItems;
    }

    public int getTotalPrice(){
        int price = 0;
        for(Item item : cartItems.values()){
            price += item.getPrice();
        }
        return price;
    }
}

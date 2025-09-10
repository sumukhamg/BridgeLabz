package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    Item item;
    ShoppingCart shoppingCart;

    @BeforeEach
    void commonItem(){
        item = new Item(1, "iPhone", 25999);
        shoppingCart = new ShoppingCart();
    }


    @Test
    void testAddingItem_shouldReturnCorrectAnswer(){
        shoppingCart.addItems(item);
        assertEquals(1, shoppingCart.cartItems.size());
    }

    @Test
    void testAddingMultipleItems(){
        Item item2 = new Item(2, "samsung", 25999);
        shoppingCart.addItems(item);
        shoppingCart.addItems(item2);
        assertEquals(2, shoppingCart.cartItems.size());
    }

    @Test
    void addingSameObject_ShouldThrowExceptionSinceIdAlreadyExist(){

        assertThrows(RuntimeException.class, () -> shoppingCart.addItems(item, item));
    }

    @Test
    void testRemovingItem_shouldReturnCorrect(){
        shoppingCart.addItems(item);
        shoppingCart.removeItem(item.getId());
        assertEquals(0, shoppingCart.cartItems.size());
    }

    @Test
    void testViewingItems_ShouldDisplayItems(){
        shoppingCart.addItems(item);

        assertEquals(true, shoppingCart.cartItems.containsKey(1));
        assertEquals(1, item.getId());
        assertEquals("iPhone", item.getName());

    }

    @Test
    void calculateTotalPrice(){
        Item item2 = new Item(2, "Samsung Mobile", 20000);
        shoppingCart.addItems(item, item2);
        assertEquals(45999, shoppingCart.getTotalPrice());
    }

    @Test
    void calculateTotalWhenCartIsEmpty(){
        assertEquals(0, shoppingCart.getTotalPrice());
    }

    @Test
    void testCaseToAddNullValues(){
        assertThrows(RuntimeException.class, () -> shoppingCart.addItems(null));
    }

    @Test
    void addingItemsWithZeroLength(){
        Item[] items = new Item[0];
        assertThrows(RuntimeException.class, () -> shoppingCart.addItems(items)
        );
    }

    @Test
    void addingNullItemsToCart_ShouldThrowException(){
        assertThrows(RuntimeException.class, () -> shoppingCart.addItems(new Item(1, null, 12999)));
    }

    @Test
    void viewCartWhenEmpty(){
        assertEquals(0, shoppingCart.cartItems.size());
    }

    @Test
    void addingMultipleItemsWithSameId(){
        Item item2 = new Item(1, "Samsung Mobile", 20000);
        ShoppingCart shoppingCart = new ShoppingCart();
        assertThrows(RuntimeException.class, () -> shoppingCart.addItems(item, item2)
        );
    }

    @Test
    void removingItemsWhenCartSizeIsZero(){
        assertThrows(RuntimeException.class, () -> shoppingCart.removeItem(1));

    }

    @Test
    void removingAnItemFromCartWhichDoesNotExist(){
        shoppingCart.addItems(item);
        assertThrows(RuntimeException.class, () -> shoppingCart.removeItem(3));
    }

    @Test
    void addingLargeNumberOfItems_ShoulrunwithoutAnyError(){
        for(int i=1; i<=10000; i++){
            shoppingCart.addItems(new Item(i, "Product - " + i, (i * 10)) );
        }

        assertEquals(10000, shoppingCart.cartItems.size());
    }

    @Test
    void addItemWithHighValuePrice(){
        shoppingCart.addItems(new Item(1, "HighValued product", Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, shoppingCart.cartItems.get(1).getPrice());
    }

    @Test
    void removingItemFromEmptyCart(){
        shoppingCart.removeItem(1);
    }

}
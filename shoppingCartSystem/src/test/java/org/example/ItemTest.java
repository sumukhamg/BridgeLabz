package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ItemTest {

    Item item;

    @BeforeEach
    void commonItemObject(){
        item = new Item(1, "Ear Phone", 1599);
    }

    @Test
    void itemCreateWithValidDetails(){
        assertNotNull(item);
        assertEquals(1, item.getId());
        assertEquals("Ear Phone", item.getName());
        assertEquals(1599, item.getPrice());
    }

    @Test
    void gettingItemDetaiils(){
        assertEquals(1, item.getId());
        assertEquals("Ear Phone", item.getName());
        assertEquals(1599, item.getPrice());

    }

    @Test
    void updateNameOfItem(){
        item.updateName("TWS earPhones");
        assertEquals("TWS earPhones", item.getName());
    }

    @Test
    void updatePriceOfAnItem(){
        item.updatePrice(2000);
        assertEquals(2000, item.getPrice());
    }

    @Test
    void createItemWithNegativePrice_ShouldThrowException(){
        Exception exception = assertThrows(RuntimeException.class, () -> new Item(2, "Purse", -2499));
        assertEquals("Price cannot be less than 0", exception.getMessage());

//          assertThrows( RuntimeException.class, () -> new Item(2, "Purse", -2499));
    }

    @Test
    void createItemWithInvalidName_ShouldThrowRuntimeException(){
        assertThrows(RuntimeException.class, () -> new Item(2, "", 2499));
    }

    @Test
    void createItemWithInvalidId_ShouldThrowRuntimeException(){
        assertThrows(RuntimeException.class, () -> new Item(0, "", 2499));
    }


}


















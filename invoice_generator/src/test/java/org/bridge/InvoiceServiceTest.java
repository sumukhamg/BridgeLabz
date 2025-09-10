package org.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {
    private InvoiceGenerator invoiceGenerator;

    @BeforeEach
    public void setup(){
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    void normalRide_ShouldReturnCorrectFare(){
        CabRides rides = new CabRides(2, 5, "Normal");
        assertEquals(70, invoiceGenerator.calculateFare(rides));
    }

    @Test
    void normalRide_ShouldReturnMinimumFare() {
        CabRides ride = new CabRides(1, 1, "Normal");
        double fare = invoiceGenerator.calculateFare(ride);
        assertEquals(25, fare);
    }

    @Test
    void multipleRide_shouldReturnTotalFare(){
        CabRides[] rides = { new CabRides(2, 5, "normal"), new CabRides(1, 1, "premium") }; // 70 + 40
        double fare = invoiceGenerator.calculateFare(rides);
        assertEquals(110, fare);
    }

    @Test
    void shouldReturnInvoiceSummary() {
        CabRides[] rides = {
                new CabRides(2, 5, "NORMAL"),
                new CabRides(1, 1, "NORMAL")
        };
        Invoice expected = new Invoice(rides.length, 95);
        Invoice actual = invoiceGenerator.getInvoice(rides);
        assertEquals(expected, actual);
    }

    @Test
    void calculateNegetiveDistance_ShouldThrowException() {
        CabRides ride = new CabRides(-2, 5, "Normal");
        assertThrows(IllegalArgumentException.class, () -> invoiceGenerator.calculateFare(ride));
    }

    @Test
    void calculateNegativeTime_ShouldThrowException() {
        CabRides ride = new CabRides(2, -5, "Normal");
        assertThrows(IllegalArgumentException.class, () -> invoiceGenerator.calculateFare(ride));
    }

    @Test
    void givenNullRide_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> invoiceGenerator.calculateFare(null));
    }

    @Test
    void givenEmptyRideArray_ShouldThrowException() {
        CabRides[] rides = {};
        assertThrows(IllegalArgumentException.class, () -> invoiceGenerator.getInvoice(rides));
    }

}
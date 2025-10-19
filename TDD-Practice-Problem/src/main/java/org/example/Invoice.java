package org.example;

public class Invoice {
    private int totalRides;
    private int totalFare;
    private int averageFare;

    public Invoice(int totalRides, int totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public int getAverageFare() {
        return averageFare;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Invoice)) return false;
        Invoice invoice = (Invoice) obj;
        return this.totalRides == invoice.totalRides &&
                Double.compare(this.totalFare, invoice.totalFare) == 0 &&
                Double.compare(this.averageFare, invoice.averageFare) == 0;
    }

}

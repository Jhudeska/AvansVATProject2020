package Notes.Les3Praktijk;

import java.time.LocalDateTime;

public class Bid {
    private int priceOffered;
    private Customer customer;
    private LocalDateTime timeOfBid;

    public Bid(int priceOffered, Customer customer) {
        this.priceOffered = priceOffered;
        this.customer = customer;
        this.timeOfBid = LocalDateTime.now();
    }

    public int getPriceOffered() {
        return priceOffered;
    }

    public LocalDateTime getTimeOfBid() {
        return timeOfBid;
    }
}

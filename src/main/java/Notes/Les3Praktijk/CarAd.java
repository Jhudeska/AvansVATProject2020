package Notes.Les3Praktijk;

import java.util.ArrayList;

public class CarAd {
    // meta data for the ad:
    private int priceAsked;
    private Seller seller;
    private ArrayList<Bid> bids;

    // Car data:
    private String model;
    private int yearConstructed;
    private int mileage;
    private String fueltype;

    public CarAd(int priceAsked, Seller seller, String model, int yearConstructed, int mileage, String fueltype) {
        // ad data:
        this.priceAsked = priceAsked;
        this.seller = seller;
        this.bids = new ArrayList<>();

        // car data
        this.model = model;
        this.yearConstructed = yearConstructed;
        this.mileage = mileage;
        this.fueltype = fueltype;
    }

    private boolean isAccepted(int priceoffered) {
//        Bid highestBid = getHighestBid();
//
//        boolean isAccepted = highestBid == null || priceoffered > highestBid.getPriceOffered();
//        return isAccepted;
        int highestPrice = getHighestOffer();
        boolean isAccepted = priceoffered > highestPrice;
        return isAccepted;
    }

    public boolean doOffer(Customer customer, int priceOffered) {
        if (isAccepted(priceOffered)) {
            bids.add(new Bid(priceOffered, customer));
            return true;
        } else {
            return false;
        }
    }

    private int getHighestOffer() {
        if (bids.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int price = bids.get(0).getPriceOffered();
            for (Bid bid : bids) {
                if (bid.getPriceOffered() > price) {
                    price = bid.getPriceOffered();
                }
            }

            return price;
        }
    }
    private Bid getHighestBid() {
        if (bids.isEmpty()) {
            return null;
        }
        Bid highestBid = bids.get(0);
        for (Bid bid : bids) {
            if (bid.getPriceOffered() > highestBid.getPriceOffered()) {
                highestBid = bid;
            }
        }

        return highestBid;
    }

    @Override
    public String toString() {
        return "CarAd{" +
                "priceAsked=" + priceAsked +
                ", seller=" + seller +
                '}';
    }
}

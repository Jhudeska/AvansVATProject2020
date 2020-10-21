package Notes.Les3Praktijk;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMarket {
    private ArrayList<CarAd> carAds;
    private ArrayList<Seller> sellers;

    public CarMarket() {
        this.carAds = new ArrayList<>();
        this.sellers = new ArrayList<>();
    }

    public void addCarAd(CarAd carAd) {
        carAds.add(carAd);
    }

    public void addSeller(Seller seller) {
        sellers.add(seller);
    }

    public void addSellers(Seller... sellers) {
        this.sellers.addAll(Arrays.asList(sellers));
    }

    public void printCarAdds() {
        for (CarAd carAd : carAds) {
            System.out.println(carAd);
        }
    }
}

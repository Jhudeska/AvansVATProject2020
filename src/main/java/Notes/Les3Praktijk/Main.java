package Notes.Les3Praktijk;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CarMarket market = new CarMarket();

        Seller patrick = new Seller("Patrick", "patrick@avans.nl", "789");
        Seller frans = new Seller("Frans", "frans@avans.nl", "788");
        Seller ivo = new Seller("Ivo", "ivo@avans.nl", "128");
        Seller paul = new Seller("Paul", "paul@avans.nl", "588");

        market.addSellers(patrick,frans,ivo,paul);

        CarAd ad1 = new CarAd(1200, paul, "citroen xsara", 2004, 235000, "gasoline");
        CarAd ad2 = new CarAd(800, ivo, "fiets", 2014, 35000, "food");
        CarAd ad3 = new CarAd(41000, patrick, "bmw i3", 2018, 65000, "elektric");

        market.addCarAd(ad1);
        market.addCarAd(ad2);
        market.addCarAd(ad3);

        market.printCarAdds();

        Customer jos = new Customer("Jos", "jos@breda.nl");
        Customer geert = new Customer("Geert", "geert@breda.nl");

        boolean offerAccepted1 = ad1.doOffer(jos, 900);
        System.out.println("offered price accepted: " + offerAccepted1);
        boolean offerAccepted2 = ad1.doOffer(jos, 800);
        System.out.println("offered price accepted: " + offerAccepted2);


//        System.out.println(patrick);
    }
}

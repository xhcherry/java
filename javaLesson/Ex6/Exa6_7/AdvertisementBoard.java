package javaLesson.Ex6.Exa6_7;

public class AdvertisementBoard {
    Advertisement adver;

    public void setAdvertisement(Advertisement adver) {
        this.adver = adver;
    }

    public void show() {
        if (adver == null) {
            System.out.println("���������");
        } else {
            adver.showAdvertisement();
        }
    }
}

package javaLesson.Ex6.Exa6_7;

public class Exa6_7 {
    public static void main(String[] args) {
        AdvertisementBoard board = new AdvertisementBoard();
        board.show();
        board.setAdvertisement(new BlackLandCorp());
        board.show();
        board.setAdvertisement(new BlackLandCorp());
        board.show();
    }
}

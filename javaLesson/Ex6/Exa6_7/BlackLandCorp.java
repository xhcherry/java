package javaLesson.Ex6.Exa6_7;

public class BlackLandCorp implements Advertisement {
    public void showAdvertisement() {
        System.out.println("**********");
        System.out.print("劳动是爹\n土地是妈\n");
        System.out.println("**********");
    }

    public String getCorpName() {
        return "黑土集团";
    }
}

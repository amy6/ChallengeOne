package in.paperwrk.challengeone;

public class NameModel {

    private String names;
    private String imageUrls;

    NameModel(String names) {
        this.names = names;
    }

    NameModel(String names, String imageUrls){
        this.names = names;
        this.imageUrls = imageUrls;
    }

    public String getNames() {
        return names;
    }

    public String getImageUrls() {
        return imageUrls;
    }
}

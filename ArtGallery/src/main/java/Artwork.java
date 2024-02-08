public class Artwork {

    private String title;
    private Artist artist;
    private final int PRICE;

    public Artwork(String inputTitle, Artist artist, int inputPrice){
        this.title = inputTitle;
        this.artist = artist;
        this.PRICE = inputPrice;
    }

    // Class Methods

    // Getters and Setters
    public int getPRICE(){
        return this.PRICE;
    }


    public Artist getArtist(){
        return this.artist;
    }
}

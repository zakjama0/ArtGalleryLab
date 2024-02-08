import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Artwork> artStock;

    public Artist(String inputName){
        this.name= inputName;
        this.artStock = new ArrayList<>();
    }

    // Class Methods
    public void makeArt(String inputName, int inputPrice){
        Artwork artwork = new Artwork(inputName, this, inputPrice);
        this.artStock.add(artwork);
    }

    public Artwork giveArtwork(){
        Artwork artwork = this.artStock.get(0);
        this.artStock.remove(0);
        return artwork;
    }

    // Getters and Setters
    public String getName(){
        return this.name;
    }

    public int getArtStockSize(){
        return this.artStock.size();
    }
}

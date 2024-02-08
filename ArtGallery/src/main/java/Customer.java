import java.util.ArrayList;

public class Customer {

    private String name;

    private int wallet;
    private ArrayList<Artwork> artCollection;
    public Customer(String inputName, int inputWallet){
        this.name = inputName;
        this.wallet = inputWallet;
        this.artCollection = new ArrayList<>();
    }

    // Class Methods
    public void buyArt(Gallery gallery){
        Artwork artwork = gallery.getArt();
        if(wallet >= artwork.getPRICE()){
            this.artCollection.add(artwork);
            gallery.removeArtwork();
            wallet -= artwork.getPRICE();
            gallery.addTill(artwork.getPRICE());
        }
    }

    // Getters and Setters
    public String getName(){
        return this.name;
    }

    public int getWallet(){
       return this.wallet;
    }

    public void setWallet(int wallet){
        this.wallet = wallet;
    }

    public int getArtCollectionSize(){
        return this.artCollection.size();
    }
}

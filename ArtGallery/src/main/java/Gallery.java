import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    public Gallery(String inputName, int inputTill){
        this.name = inputName;
        this.till = inputTill;
        stock = new ArrayList<>();
    }

    // Class Methods
    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    public void removeArtwork(){
        this.stock.remove(getArt());
    }

    public void addTill(int price){
        this.till += price;
    }

    public int stock_take(){
        int total = 0;
        for(Artwork artwork : stock){
            total += artwork.getPRICE();
        }
        return total;
    }

    // Getters and Setters
    public String getName(){
        return this.name;
    }

    public int getTill(){
        return this.till;
    }

    public void setTill(int till){
        this.till = till;
    }
    public int getStockSize(){
        return this.stock.size();
    }

    public Artwork getArt(){
        return this.stock.get(0);
    }

}

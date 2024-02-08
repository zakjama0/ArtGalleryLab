import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Gallery gallery;
    Artist artist;
    Customer customer;

    @BeforeEach
    void setUp(){
        gallery = new Gallery("The Gallery.", 0);
        customer = new Customer("Richie", 10000);
        artist = new Artist("Da Vinci");
    }

    @Test
    void testGetName(){
        assertThat(customer.getName()).isEqualTo("Richie");
    }

    @Test
    public void hasSetWallet(){
      customer.setWallet(50000);
      assertThat(customer.getWallet()).isEqualTo(50000);
    }

    @Test
    public void hasTransactionCompleted(){
        artist.makeArt("London", 500);
        gallery.addArtwork(artist.giveArtwork());
        customer.buyArt(gallery);
        assertThat(gallery.getStockSize()).isEqualTo(0);
        assertThat(gallery.getTill()).isEqualTo(500);
        assertThat(customer.getArtCollectionSize()).isEqualTo(1);
    }

}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist artist;
    Artwork artwork1;
    Artwork artwork2;


    @BeforeEach
    public void setUp(){
        artist = new Artist("Zak");
        gallery = new Gallery("TheGallery.", 1000000);
        artwork1 = new Artwork("Whatever", artist, 200);
        artwork2 = new Artwork("ASDA", artist, 500);
    }


    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("TheGallery.");
    }

    @Test
    public void canSetTill(){
        gallery.setTill(50000);
        assertThat(gallery.getTill()).isEqualTo(50000);
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(1000000);
    }

    @Test
    public void testStockTake(){
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);
        assertThat(gallery.stock_take()).isEqualTo(700);
    }


}

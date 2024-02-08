import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class ArtistTest {
    Artist artist;
    Gallery gallery;
    @BeforeEach
    public void setUp(){
        artist = new Artist("Bob");
        gallery = new Gallery("London", 100000);
    }

    @Test
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("Bob");
    }

    @Test
    public void canMakeArt(){
        artist.makeArt("London", 500);
        assertThat(artist.getArtStockSize()).isEqualTo(1);
    }
    @Test

    public void testGiveToGallery(){
        artist.makeArt("London", 500);
        gallery.addArtwork(artist.giveArtwork());
        assertThat(artist.getArtStockSize()).isEqualTo(0);
        assertThat(gallery.getStockSize()).isEqualTo(1);
    }


}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;
    Artist artist;

    @BeforeEach
    void setUp(){
        artist = new Artist("Bob");
        artwork = new Artwork("Best Art", artist, 5000);
    }

    @Test
    void hasPrice(){
        assertThat(artwork.getPRICE()).isEqualTo(5000);
    }
    @Test
    void hasArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }
}

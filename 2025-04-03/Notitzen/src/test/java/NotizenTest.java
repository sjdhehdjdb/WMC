import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotizenTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void felher_leer() {
        Notizen notizen = new Notizen();
        try {
            notizen.erfassen("Brot kaufen");
        } catch (NotizenException e) {
            System.out.println(e.getMessage());
        }
        notizen.ausgeben();
    }

    @Test
    void felher_leer1() {

        Notizen notizen = new Notizen();
        try {
            notizen.erfassen("Brot kaufen");
            notizen.erfassen("Brot 1 kaufen");
            notizen.erfassen("Brot 2 kaufen");
            notizen.ausgeben();
        } catch (NotizenException e) {
            System.out.println("UNERWARTETE Exception gefangen: " + e.getMessage());
            fail();
        }
    }

    @Test
    void felher_leer2_null() {
        Notizen notizen = new Notizen();
        try {
            notizen.erfassen("Brot kaufen");
            notizen.erfassen("Brot 1 kaufen");
            notizen.erfassen("Brot 2 kaufen");
            notizen.ausgeben();

            notizen.erfassen(null);
            fail();

        } catch (NotizenException e) {
            System.out.println(e.getMessage());
            // optional zum debuggen verwenden ----->   e.printStackTrace();
        }
        notizen.ausgeben();
    }






    @BeforeEach
    void setup() {
        System.out.println("\n----------- next taste case start -------------- \n");
    }
}
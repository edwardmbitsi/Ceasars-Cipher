import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTest {

    @Test
    public void runEncrypt_instatiares() {
        Encryption testEncrypt = new Encryption("pText", Key);
        assertEquals(true, testEncrpt instanceof Encryption);
    }
}
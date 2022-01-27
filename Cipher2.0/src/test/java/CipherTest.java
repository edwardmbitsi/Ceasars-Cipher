import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {

    @Test
    public void createCipher_instanceOfCipherClass_returnsCipher() {
        Cipher cipher = new Cipher ( "great!");
        assertEquals(true,  cipher instanceof Cipher);
    }

    @Test
    public void getInputText_returnTheInputtedText_returnsTheInput() {
        Cipher cipher = new Cipher("great!");
        assertEquals("great!", cipher.getInputText());
    }


}
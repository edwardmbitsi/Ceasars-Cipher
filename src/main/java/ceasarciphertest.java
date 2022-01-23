package ceasarcipher;
import static org.junit.jupiter.api.Assertions.*;

public class ceasarciphertest {
	
	@Test
	public void runCeasar_cipher_instatiares() {
		Ceasarcipher testCipher = new Ceasarcipher("pText",Key);
		assertEquals(true, testCipher instanceof Ceasarcipher);
	}
	

}

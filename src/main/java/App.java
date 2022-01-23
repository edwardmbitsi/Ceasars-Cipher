
import java.io.*;

public class App {
    public static void main(String [] args) {
        System.out.println("Welcome To Ceasar Cipher!");
        boolean runningProgram = true;

        while(runningProgram){
            System.out.println("**---------------------------------------------------------**");
            System.out.println("Enter A, B or C to choose one of the following options");
            System.out.println("A. Encrypt A Message");
            System.out.println("B. Decrypt A Message");
            System.out.println("C. Exit");
            try{

                String Choice = scan.nextLine();
                System.out.println(choice);

                if(choice.equals("A")){

                   public static String encoding(String pText, int Key) {
		     pText = pText.toLowerCase();
		     String cText ="";
		     for(int i = 0; i<pText.length(); i++) {
		   	int charIndex = alphabet.indexOf(pText.charAt(i));
			int newIndex = (charIndex + Key) % 26;
			char cipherChar = alphabet.charAt(newIndex);
			cText = cText + cipherChar;
		    }
		    return cText;

	

	}

                }else if(choice.equals("B")){
                   public static String decoding(String cText, int Key) {
		        cText = cText.toLowerCase();
		        String pText = "";
		        for (int i = 0; i<cText.length(); i++) {
			    int charIndex = alphabet.indexOf(cText.charAt(i));
		     	int newIndex = (charIndex - Key) % 26;
			    if (newIndex <0) {
				newIndex = alphabet.length() + newIndex;
			}
			char plainChar = alphabet.charAt(newIndex);
			pText = pText + plainChar;
		}
		
		
		return pText;
	}

                }else if(choice.equals("C")) {
                    System.out.println("Successful Exit");
                    runningProgram = false;
                }else {
                    System.out.println("Invalid Choice please try again");
                }



            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

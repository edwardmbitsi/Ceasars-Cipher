import java.util.Scanner;

public class App{
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean selectionsLoop = true;

        System.out.println("Welcome to Caesar-Cipher");
        while(selectionsLoop){
            System.out.println("..................................................");
            System.out.println("Would you like to Encrypt or Decrypt?(Select a number): \n" + "1:Encrypt message \n" + "2:Decrypt message \n" + "3:Exit");
            int userSelection = userInput.nextInt();
            userInput.nextLine();

            if (userSelection == 1){
                System.out.println("Enter message to Encrypt:");
                String userMessage = userInput.nextLine();
                System.out.println("Select a direction: foward or backward");
                String userDirection = "";

                boolean correctDirection = true;
                while (correctDirection){
                    userDirection = userInput.nextLine();
                    if(!userDirection.equalsIgnoreCase("forward") && !userDirection.equalsIgnoreCase("backward")){
                        System.out.println("Select a direction by typing backward or forward");
                    }
                    else {
                        correctDirection = false;
                    }
                }
                System.out.println("How many alphabets to the " +userDirection + ".");
                int userShiftKey = userInput.nextInt();
                Cipher cipher = new Cipher(userMessage);
                System.out.println("Your Encrypted message is :\n" + cipher.codedText(userDirection,userShiftKey));
            }

            else if (userSelection == 2) {
                System.out.println("Enter message to decrypt");
                String userMessage = userInput.nextLine();
                System.out.println("Select a direction, backward or forward?");
                String userDirection = "";



                boolean correctDirection = true;
                while(correctDirection){
                    userDirection = userInput.nextLine();
                    if(!userDirection.equalsIgnoreCase("forward") && !userDirection.equalsIgnoreCase("backward")){
                        System.out.println("Select a direction by typing forward or backward");
                    }
                    else {
                        correctDirection = false;
                    }
                }
                System.out.println("How many alphabets to the " +userDirection + ".");
                int userShiftKey = userInput.nextInt();
                Cipher cipher = new Cipher(userMessage);
                System.out.println("Your decrypted message is :\n" + cipher.decodedText(userDirection,userShiftKey));

            } else {
                selectionsLoop = false;
            }
        } userInput.close();

    }
}
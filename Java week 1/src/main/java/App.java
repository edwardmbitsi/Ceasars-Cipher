
import java.io.*;

public class App {
    public static void main(String [] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Welcome To Ceasar Cipher!");
        boolean runningProgram = true;

        while(runningProgram){
            System.out.println("**---------------------------------------------------------**");
            System.out.println("Enter A, B or C to choose one of the following options");
            System.out.println("A. Encrypt A Message");
            System.out.println("B. Decrypt A Message");
            System.out.println("C. Exit");
            try{


                String choice = bufferedReader.readLine();
                System.out.println(choice);

                if(choice.equals("A")){

                    int key = 6;
                    System.out.println("Enter a message");
                    Console myConsole = System.console();
                    String text = myConsole.readLine();
                    System.out.println("You entered " + text);
                    char[] chars = text.toCharArray();
                    for (char c : chars) {
                        c += key;
                        System.out.print(c);

                    }

                }else if(choice.equals("B")){
                    int key = 6;
                    System.out.println("Enter a message");
                    Console myConsole = System.console();
                    String text = myConsole.readLine();
                    System.out.println("You entered " + text);
                    char[] chars = text.toCharArray();
                    for (char c : chars) {
                        c -= key;
                        System.out.print(c);
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

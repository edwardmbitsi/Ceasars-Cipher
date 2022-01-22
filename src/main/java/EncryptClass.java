public class EncryptClass {
    public static void main(String[] args) {
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


    }
}
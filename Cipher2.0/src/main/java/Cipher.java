public class Cipher {
    private final String inputText;
    private String encryptedText;
    private String decryptedText;

    private final String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};


    public Cipher (String inputText){
        this.inputText = inputText;
        this.encryptedText = "";
        this.decryptedText = "";
    }
    public String getInputText (){
        return inputText;
    }
    public String codedText (String shiftDirection, int shiftKey){
        String[] splitInputText = inputText.split("");

        for (String letter : splitInputText){
            if (letter.contains(" ")){
                encryptedText+=" ";
            } else if(letter.matches("[^a-zA-Z]")){
                encryptedText += letter;
            }

            else {
                if(shiftDirection.equalsIgnoreCase("forward")){
                    for (int i=0; i<alphabets.length;i++){
                        if(letter.equalsIgnoreCase(alphabets[i])){
                            if((i+shiftKey) >= alphabets.length){
                                encryptedText += alphabets[(i-26 + shiftKey)];
                            } else {
                                encryptedText+=alphabets[(i+shiftKey)];
                            }
                        }
                    }
                }

                else {
                    for (int i = alphabets.length-1; i >=0 ; i--) {
                        if (letter.equalsIgnoreCase(alphabets[i])){
                            if ((i-shiftKey)<0){
                                encryptedText += alphabets[(i+26-shiftKey)];
                            }
                            else {
                                encryptedText += alphabets[(i-shiftKey)];
                            }
                        }
                    }
                }
            }
        }
        return encryptedText;
    }
    public String decodedText (String shiftDirection, int shiftKey){
        String[] splitInputText = inputText.split("");
        for (String letter: splitInputText){
            if(letter.contains(" ")){
                decryptedText+= " ";
            } else if (letter.matches("[^a-zA-Z]")){
                decryptedText += letter;
            }
            else {
                if(shiftDirection.equalsIgnoreCase("right")){
                    //right shift key decryption
                    for (int i = 0; i <alphabets.length ; i++) {
                        if(letter.equalsIgnoreCase(alphabets[i])){
                            if ((i+shiftKey) >= alphabets.length){
                                decryptedText += alphabets[(i-26-shiftKey)];
                            } else {
                                decryptedText += alphabets[(i-shiftKey)];
                            }
                        }
                    }
                } else {
                   
                    for (int i = alphabets.length-1; i >=0 ; i--) {
                        if (letter.equalsIgnoreCase(alphabets[i])){
                            if ((i+shiftKey) > alphabets.length-1){
                                decryptedText += alphabets[(i-26+shiftKey)];
                            } else {
                                decryptedText += alphabets[i+shiftKey];
                            }
                        }

                    }
                }
            }
        }
        return decryptedText;
    }
}

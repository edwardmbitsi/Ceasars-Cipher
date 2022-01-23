package ceasarcipher;

import java.util.Scanner;

public class ceasarcipher {
	
	static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
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
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Plain Text >>>");
		String plain = scan.nextLine();
		
		System.out.print("Enter Key >> ");
		int Key = scan.nextInt();
		
		String cipherText = encoding(plain, Key);
		
		System.out.println("The cipher text:" + cipherText);
		
		System.out.println("the decoded message is: " + decoding(cipherText, Key));
}
}
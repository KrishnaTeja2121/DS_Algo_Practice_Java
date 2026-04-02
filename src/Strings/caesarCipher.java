package Strings;

public class caesarCipher {
	
	static String caesarCipher(String str, int k) {
		StringBuilder sb = new StringBuilder();
		 for (int i = 0; i < str.length(); i++) {
		        char ch = str.charAt(i);
		        sb.append(encrypt(ch, k));
		    }
		 return sb.toString();
		 
	}
	
	/* Encrypts a character using Caesar Cipher */
	
	private static char encrypt(char ch, int K) {
		if (!Character.isLetter(ch)) {
	        return ch;
	    }
		char base = Character.isLowerCase(ch) ? 'a' : 'A';
	    return (char) ((ch - base + K) % 26 + base);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

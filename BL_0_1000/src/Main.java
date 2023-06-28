import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println((b % a == 0) ? (b / a - 1) : (b / a));
            System.out.println(b / a);
        } else {
            System.out.println(0);
        }

        String str = "Hello";
        int num = 4;
        String encryptedStr = CaesarCipher(str, num);
        System.out.println(encryptedStr);  // Output: Lipps
        String str1 = "hello";
        int num1 = 4;
        String encryptedStr1 = CaesarCipher(str1, num1);
        System.out.println(encryptedStr1);  // Output: hello
    }

    public static String CaesarCipher(String str, int num) {

        if (str.charAt(0) >= 97) {
            return str;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Determine the case of the letter (uppercase or lowercase)
                char base = Character.isUpperCase(ch) ? 'A' : 'a';

                // Apply the Caesar Cipher shift
                char shiftedChar = (char) ((ch - base + num) % 26 + base);

                result.append(shiftedChar);
            } else {
                // Append non-letter characters as is
                result.append(ch);
            }
        }

        return result.toString();
    }
}

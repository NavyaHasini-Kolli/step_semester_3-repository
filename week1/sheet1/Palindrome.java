import java.util.Scanner;

public class Palindrome {

    static boolean checkIterative(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left = left + 1;
            right = right - 1;
        }
        return true;
    }

    static boolean checkRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return checkRecursive(text.substring(1, text.length() - 1));
    }

    static boolean checkArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        String reversedText = new String(reversed);
        return text.equals(reversedText);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = checkIterative(text);
        boolean result2 = checkRecursive(text);
        boolean result3 = checkArrayReversal(text);

        String r1;
        if (result1 == true) { r1 = "Palindrome"; } else { r1 = "Not Palindrome"; }

        String r2;
        if (result2 == true) { r2 = "Palindrome"; } else { r2 = "Not Palindrome"; }

        String r3;
        if (result3 == true) { r3 = "Palindrome"; } else { r3 = "Not Palindrome"; }

        System.out.println("Iterative: " + r1);
        System.out.println("Recursive: " + r2);
        System.out.println("Array Reversal: " + r3);
    }
}
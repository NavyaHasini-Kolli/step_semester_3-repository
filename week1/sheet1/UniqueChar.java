import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c] = frequency[c] + 1;
        }

        char result = '\0';
        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 1) {
                result = c;
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + result + "'");
        }
    }
}
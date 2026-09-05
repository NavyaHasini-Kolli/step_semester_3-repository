import java.util.Scanner;

public class Streak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal log: ");
        String s = sc.nextLine();

        int currentCount = 1;
        char currentChar = s.charAt(0);

        int longestCount = 1;
        char longestChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == currentChar) {
                currentCount = currentCount + 1;
            } else {
                currentChar = ch;
                currentCount = 1;
            }

            if (currentCount > longestCount) {
                longestCount = currentCount;
                longestChar = currentChar;
            }
        }

        System.out.println("Longest Streak: '" + longestChar + "' repeated " + longestCount + " times");
    }
}
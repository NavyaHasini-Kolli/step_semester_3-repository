import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter review: ");
        String review = sc.nextLine();

        String[] words = review.split(" ");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();

            if (len >= 1 && len <= 4) {
                shortCount = shortCount + 1;
            } else if (len >= 5 && len <= 8) {
                mediumCount = mediumCount + 1;
            } else {
                longCount = longCount + 1;
            }
        }

        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }
}
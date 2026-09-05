import java.util.Scanner;

public class Typing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original text: ");
        String original = sc.nextLine();
        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();

        int matched = 0;
        int mismatchPosition = -1;

        for (int i = 0; i < original.length(); i++) {
            char c1 = original.charAt(i);
            char c2 = typed.charAt(i);

            if (c1 == c2) {
                matched = matched + 1;
            } else {
                if (mismatchPosition == -1) {
                    mismatchPosition = i;
                }
            }
        }

        double accuracy = (matched * 100.0) / original.length();

        System.out.println("Matched: " + matched + "/" + original.length());
        System.out.println("Accuracy: " + accuracy + "%");

        if (mismatchPosition == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println("First Mismatch at position " + (mismatchPosition + 1));
        }
    }
}
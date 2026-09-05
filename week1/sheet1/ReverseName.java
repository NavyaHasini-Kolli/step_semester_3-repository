import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        char[] chars = name.toCharArray();
        char[] reversedChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            reversedChars[i] = chars[chars.length - 1 - i];
        }

        String reversedName = new String(reversedChars);

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversedName);
    }
}
import java.util.Scanner;

public class ISBNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter raw ISBN code: ");
        String raw = sc.nextLine();

        String trimmed = raw.trim();
        String prefix = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        String code = prefix + rest;

        if (code.length() != 13) {
            System.out.println("Invalid: code must be exactly 13 characters");
            return;
        }

        String pubCode = code.substring(0, 3);
        String body = code.substring(3);

        boolean pubOk = true;
        for (int i = 0; i < pubCode.length(); i++) {
            if (!Character.isLetter(pubCode.charAt(i))) {
                pubOk = false;
            }
        }
        if (!pubOk) {
            System.out.println("Invalid: publisher code must be 3 letters");
            return;
        }

        boolean bodyOk = true;
        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                bodyOk = false;
            }
        }
        if (!bodyOk) {
            System.out.println("Invalid: remaining 10 characters must be digits");
            return;
        }

        String year = body.substring(0, 4);
        String catalog = body.substring(4);

        System.out.println("[" + pubCode + "] YEAR: " + year + " | CATALOG: " + catalog);
    }
}
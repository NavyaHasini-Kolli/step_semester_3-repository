import java.util.Scanner;

public class BankReferenceValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter raw reference code: ");
        String raw = sc.nextLine();

        String trimmed = raw.trim();
        String prefix = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        String reference = prefix + rest;

        if (reference.length() != 14) {
            System.out.println("Invalid: reference must be exactly 14 characters");
            return;
        }

        String bankCode = reference.substring(0, 3);
        String body = reference.substring(3);

        boolean codeOk = true;
        for (int i = 0; i < bankCode.length(); i++) {
            if (!Character.isLetter(bankCode.charAt(i))) {
                codeOk = false;
            }
        }
        if (!codeOk) {
            System.out.println("Invalid: bank code must be 3 letters");
            return;
        }

        boolean bodyOk = true;
        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                bodyOk = false;
            }
        }
        if (!bodyOk) {
            System.out.println("Invalid: remaining 11 characters must be digits");
            return;
        }

        String date = body.substring(0, 6);
        String seq = body.substring(6);

        String dd = date.substring(0, 2);
        String mm = date.substring(2, 4);
        String yy = date.substring(4, 6);

        System.out.println("[" + bankCode + "] DATE: " + dd + "/" + mm + "/" + yy + " | SEQ: " + seq);
    }
}
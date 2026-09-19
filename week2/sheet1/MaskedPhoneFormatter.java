import java.util.Scanner;

public class MaskedPhoneFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        boolean valid = true;
        if (phone.length() != 10) {
            valid = false;
        } else {
            for (int i = 0; i < phone.length(); i++) {
                if (!Character.isDigit(phone.charAt(i))) {
                    valid = false;
                }
            }
        }

        if (!valid) {
            System.out.println("Invalid phone number");
        } else {
            String lastFour = phone.substring(6);
            System.out.println("XXXXXX-" + lastFour);
        }
    }
}
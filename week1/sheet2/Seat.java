import java.util.Scanner;

public class Seat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate Seat Number Found: " + a[i]);
                    found = true;
                }
            }
        }

        if (found == false) {
            System.out.println("No Duplicate Seats Found");
        }
    }
}
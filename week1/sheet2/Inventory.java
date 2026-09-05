import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter Section A values:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter Section B values:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < n; i++) {
            totalA = totalA + sectionA[i];
        }

        for (int i = 0; i < n; i++) {
            totalB = totalB + sectionB[i];
        }

        String status;
        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        int maxValue = sectionA[0];
        String maxSection = "Section A";
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (sectionA[i] > maxValue) {
                maxValue = sectionA[i];
                maxSection = "Section A";
                maxIndex = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (sectionB[i] > maxValue) {
                maxValue = sectionB[i];
                maxSection = "Section B";
                maxIndex = i;
            }
        }

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + status);
        System.out.println("Highest Quantity: " + maxValue + " (" + maxSection + ", Item " + (maxIndex + 1) + ")");
    }
}
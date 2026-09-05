import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of team members: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter height (m) for Person " + i + ": ");
            double height = sc.nextDouble();

            System.out.print("Enter weight (kg) for Person " + i + ": ");
            double weight = sc.nextDouble();

            double bmi = weight / (height * height);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            System.out.println("Person " + i + " | BMI: " + bmi + " | Status: " + status);
        }
    }
}
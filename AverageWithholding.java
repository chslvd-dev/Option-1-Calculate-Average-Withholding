import java.util.Scanner;

public class AverageWithholding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weekly income: $");
        double weeklyIncome = scanner.nextDouble();

        if (weeklyIncome < 0) {
            System.out.println("Income must be zero or higher.");
            scanner.close();
            return;
        }

        double taxRate;

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        double weeklyWithholding = weeklyIncome * taxRate;

        System.out.printf("Weekly income: $%.2f%n", weeklyIncome);
        System.out.printf("Tax rate: %.0f%%%n", taxRate * 100);
        System.out.printf("Weekly tax withholding: $%.2f%n", weeklyWithholding);

        scanner.close();
    }
}
import java.util.Scanner;

public class TaxRateCalculator {

    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their weekly income
        System.out.println("Enter your weekly income: ");
        double income = scanner.nextDouble();

        // Initialize the tax rate
        double taxRate = 0.0;

        // Determine the tax rate based on the income
        if (income < 500) {
            taxRate = 0.10; // 10%
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15; // 15%
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20; // 20%
        } else if (income >= 2500) {
            taxRate = 0.30; // 30%
        }

        // Calculate the tax withholding
        double taxWithholding = income * taxRate;

        // Display the result
        System.out.printf("Your weekly tax withholding is: $%.2f\n", taxWithholding);
    }
}
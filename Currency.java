package currency;

import java.util.Scanner;

public class Currency {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Please select the conversion type:");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.println("3. USD to GBP");
        System.out.println("4. GBP to USD");
        System.out.println("5. EUR to GBP");
        System.out.println("6. GBP to EUR"1);

        int choice = scanner.nextInt();

        System.out.println("Enter the amount to convert:");
        double amount = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = usdToEur(amount);
                break;
            case 2:
                result = eurToUsd(amount);
                break;
            case 3:
                result = usdToGbp(amount);
                break;
            case 4:
                result = gbpToUsd(amount);
                break;
            case 5:
                result = eurToGbp(amount);
                break;
            case 6:
                result = gbpToEur(amount);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }

        System.out.printf("The converted amount is: %.2f%n", result);
    }

    private static double usdToEur(double amount) {
        return amount * 0.84; // 1 USD = 0.84 EUR (approximate exchange rate)
    }

    private static double eurToUsd(double amount) {
        return amount * 1.19; // 1 EUR = 1.19 USD (approximate exchange rate)
    }

    private static double usdToGbp(double amount) {
        return amount * 0.76; // 1 USD = 0.76 GBP (approximate exchange rate)
    }

    private static double gbpToUsd(double amount) {
        return amount * 1.32; // 1 GBP = 1.32 USD (approximate exchange rate)
    }

    private static double eurToGbp(double amount) {
        return amount * 0.90; // 1 EUR = 0.90 GBP (approximate exchange rate)
    }

    private static double gbpToEur(double amount) {
        return amount * 1.11; // 1 GBP = 1.11 EUR (approximate exchange rate)
    }

}

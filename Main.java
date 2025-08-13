import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // أسعار صرف ثابتة (مثال)
        double usdToEur = 0.91;
        double usdToDzd = 134.50;
        double eurToUsd = 1.10;
        double eurToDzd = 148.00;
        double dzdToUsd = 0.0074;
        double dzdToEur = 0.0068;

        System.out.println("=== Currency Converter ===");
        System.out.println("Supported currencies: USD, EUR, DZD");

        System.out.print("Enter source currency (USD/EUR/DZD): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (USD/EUR/DZD): ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double result = 0;
        boolean valid = true;

        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {

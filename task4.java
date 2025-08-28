import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usdRate = 0.012; 
        double eurRate = 0.011; 
        double jpyRate = 1.70;  
        System.out.println("Currency Converter (Base: INR)");
        System.out.print("Enter amount in INR: ");
        double amount = sc.nextDouble();
        System.out.println("Convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. JPY");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();
        double converted = 0;
        String symbol = "";
        switch (choice) {
            case 1:
                converted = amount * usdRate;
                symbol = "USD $";
                break;
            case 2:
                converted = amount * eurRate;
                symbol = "EUR €";
                break;
            case 3:
                converted = amount * jpyRate;
                symbol = "JPY ¥";
                break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }
        System.out.printf("Converted Amount: %.2f %s\n", converted, symbol);
        sc.close();
    }
}

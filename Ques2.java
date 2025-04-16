import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select Deposit Type:");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1: 
                System.out.print("Enter Principal amount (P): ");
                double principal = scanner.nextDouble();
                System.out.print("Enter Rate of Interest (R) in %: ");
                double rate = scanner.nextDouble();
                System.out.print("Enter Time period (N) in years: ");
                int years = scanner.nextInt();
                
                double termMaturity = principal * Math.pow((1 + rate / 100), years);
                System.out.printf("Maturity Amount for Term Deposit: %.2f\n", termMaturity);
                break;
            
            case 2: 
                System.out.print("Enter Monthly Installment (P): ");
                double monthlyInstallment = scanner.nextDouble();
                System.out.print("Enter Rate of Interest (R) in %: ");
                double rdRate = scanner.nextDouble();
                System.out.print("Enter Time period (N) in months: ");
                int months = scanner.nextInt();
                
                double recurringMaturity = (monthlyInstallment * months) + (monthlyInstallment * months * (months + 1) / 2 * rdRate / 100 * 1 / 12);
                System.out.printf("Maturity Amount for Recurring Deposit: %.2f\n", recurringMaturity);
                break;
            
            default:
                System.out.println("Invalid choice! Please select either 1 or 2.");
        }
        
        scanner.close();
    }
}

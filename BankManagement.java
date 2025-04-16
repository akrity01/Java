import java.util.Scanner;

class Bank {
    private static int accountCounter = 1000; // Initial account number
    private String name;
    private String address;
    private int accountNumber;
    private double balance;

    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = ++accountCounter;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address updated successfully.");
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Bank[] customers = new Bank[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            customers[i] = new Bank(name, address, balance);
        }

        while (true) {
            System.out.println("\n1. Display depositor information");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Change address");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 5) break;

            System.out.print("Enter account number: ");
            int accNum = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            Bank customer = null;
            for (Bank b : customers) {
                if (b.getAccountNumber() == accNum) {
                    customer = b;
                    break;
                }
            }
            
            if (customer == null) {
                System.out.println("Account not found.");
                continue;
            }

            switch (choice) {
                case 1:
                    customer.displayInfo();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    customer.deposit(depositAmount);
                    customer.displayInfo();
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    customer.withdraw(withdrawAmount);
                    customer.displayInfo();
                    break;
                case 4:
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    customer.changeAddress(newAddress);
                    customer.displayInfo();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private long accountNumber;
    private String accountType;
    private double balance;
    private ArrayList<Double> transactionHistory;

    public BankAccount(String name, long accountNumber, String accountType) {
        this.depositorName = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(amount);
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(-amount);
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void displayInfo() {
        System.out.println("Account Information:");
        System.out.println("Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (double transaction : transactionHistory) {
            if (transaction > 0) {
                System.out.println("Deposit: " + transaction);
            } else {
                System.out.println("Withdrawal: " + (-transaction));
            }
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter depositor's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();

        BankAccount account = new BankAccount(name, accountNumber, accountType);

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Info");
            System.out.println("4. Display Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.displayInfo();
                    break;
                case 4:
                    account.displayTransactionHistory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

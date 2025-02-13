package common_problem.banking_system;

import java.util.*;

public class BankingSystem {
    private static Map<String, Double> customerAccounts = new HashMap<>();

    private static Map<String, Double> sortedByBalance = new TreeMap<>(Comparator.comparing(customerAccounts::get));

    private static Queue<String> withdrawalQueue = new LinkedList<>();

    public static void createAccount(String accountNumber, double initialBalance) {
        customerAccounts.put(accountNumber, initialBalance);
        sortedByBalance.put(accountNumber, initialBalance);
    }

    public static double checkBalance(String accountNumber) {
        return customerAccounts.getOrDefault(accountNumber, 0.0);
    }

    public static void deposit(String accountNumber, double amount) {
        double balance = customerAccounts.get(accountNumber);
        customerAccounts.put(accountNumber, balance + amount);
        sortedByBalance.put(accountNumber, balance + amount);
    }

    public static void requestWithdrawal(String accountNumber, double amount) {
        withdrawalQueue.add(accountNumber);
    }

    public static void processWithdrawal() {
        if (withdrawalQueue.isEmpty()) {
            System.out.println("No withdrawal requests to process.");
            return;
        }

        String accountNumber = withdrawalQueue.poll();
        double balance = customerAccounts.get(accountNumber);

        if (balance >= 100) {
            customerAccounts.put(accountNumber, balance - 100);
            sortedByBalance.put(accountNumber, balance - 100);
            System.out.println("Withdrawal of 100 processed for Account: " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Account: " + accountNumber);
        }
    }

    public static void displaySortedByBalance() {
        System.out.println("\nCustomers Sorted by Balance:");
        for (Map.Entry<String, Double> entry : sortedByBalance.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " | Balance: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        createAccount("A123", 500);
        createAccount("B456", 1500);
        createAccount("C789", 300);
        createAccount("D012", 250);

        System.out.println("Initial Account Balances:");
        for (Map.Entry<String, Double> entry : customerAccounts.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " | Balance: " + entry.getValue());
        }

        deposit("A123", 200);
        deposit("C789", 100);

        requestWithdrawal("A123", 100);
        requestWithdrawal("B456", 100);
        requestWithdrawal("C789", 100);
        requestWithdrawal("D012", 300);

        displaySortedByBalance();

        processWithdrawal();
        processWithdrawal();
        processWithdrawal();
        processWithdrawal();

        System.out.println("\nUpdated Account Balances after withdrawals:");
        for (Map.Entry<String, Double> entry : customerAccounts.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " | Balance: " + entry.getValue());
        }
    }
}


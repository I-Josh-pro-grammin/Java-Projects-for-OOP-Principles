package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, 5000));
        accounts.add(new Account(2, 10000));

        boolean exit = false;

        while (!exit) {
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();

            Account foundAccount = null;

            for (Account acc : accounts) {
                if (acc.getAccountNumber() == accountNumber) {
                    foundAccount = acc;
                    break;
                }
            }

            if (foundAccount == null) {
                System.out.println("Account not found! Would you like to create a new one? (yes/no)");
                String response = input.next();

                if (response.equalsIgnoreCase("yes")) {
                    System.out.print("Enter new account number: ");
                    int newAccNum = input.nextInt();

                    boolean exists = false;
                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == newAccNum) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Account already exists!");
                        continue;
                    }

                    System.out.print("Enter initial deposit: ");
                    double initialBalance = input.nextDouble();
                    foundAccount = new Account(newAccNum, initialBalance);
                    accounts.add(foundAccount);
                    System.out.println("Account created successfully!");
                } else {
                    System.out.println("Goodbye!");
                    break;
                }
            }

            System.out.println("Welcome! What would you like to do?");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                try{
                    System.out.print("Enter amount to withdraw: ");
                    double amount = input.nextDouble();
                    foundAccount.withdraw(amount);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 2) {
                try{
                    System.out.print("Enter amount to deposit: ");
                    double amount = input.nextDouble();
                    foundAccount.deposit(amount);
                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Invalid option selected.");
            }

            System.out.println("Current account details:");

            System.out.println("Do you want to continue? (yes/no)");
            String cont = input.next();
            if (cont.equalsIgnoreCase("no")) {
                exit = true;
            }
        }

        input.close();
        System.out.println("Thank you for using the bank!");
    }
}

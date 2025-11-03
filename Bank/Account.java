package Bank;

public class Account extends Person{
    private int accountNumber;
    private double balance;
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw  new IllegalArgumentException("You can't deposit a debt or nothing");
        }
        balance += amount;
        System.out.println("Deposited " + amount + " to account " + accountNumber + " Your balance is " + balance);
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            throw new IllegalArgumentException("You don't have this money in your account " + accountNumber + " Your balance is " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from account " + accountNumber + " Your balance is " + balance);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}

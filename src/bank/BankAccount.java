package bank;

public class BankAccount {

    private String name;
    private int balance;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }

    //public BankAccount(String name, int balance) {
    //    this.name = name;
    //    this.balance = balance;
    //}

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("\nYou successfully deposited " + amount + " into your bank account");
        System.out.println("Your new balance is: " + balance);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("\nError! Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("\nYou successfully withdrew " + amount + " from your bank account");
            System.out.println("\nYour new balance is: " + balance);
        }
    }
}

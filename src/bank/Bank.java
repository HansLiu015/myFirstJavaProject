package bank;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean quit = false;

        System.out.println("-==========[ Welcome to BaBank! ]==========-");
        System.out.print("\nTo start a bank account, enter your name: ");
        String name = scan.nextLine();

        BankAccount myAccount = new BankAccount(name);

        System.out.println("\nBank account created!");
        System.out.println("Name: " + myAccount.getName());
        System.out.println("Your balance: " + myAccount.getBalance());

        while (!quit) {
            System.out.println("-----------------------------------------");
            System.out.println("What would you like to do?\n");
            System.out.println("1. Deposit into bank account");
            System.out.println("2. Withdraw from bank account");
            System.out.println("0. Quit\n");
            myAccount.printBalance();
            System.out.print("\nYour answer: ");

            int option = scan.nextInt();

            if (option == 1) {
                System.out.println("-----------------------------------------");
                System.out.print("Enter amount to deposit: ");
                myAccount.deposit(scan.nextInt());
            } else if (option == 2 && myAccount.getBalance() != 0) {
                System.out.println("-----------------------------------------");
                System.out.print("Enter amount to withdraw: ");

                int amount = scan.nextInt();

                myAccount.withdraw(amount);

            } else if (option == 2 && myAccount.getBalance() <= 0) {
                System.out.println("\nThere is no money in your bank account!");
            }
            else {
                System.out.println("\nThank you for choosing BaBank! Come back again!");
                quit = true;
            }
        }
    }
}

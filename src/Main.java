import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter 4 digit PIN: ");
        int userPin = 1234;
        Scanner pin = new Scanner(System.in);
        int inputPin = pin.nextInt();

        System.out.println("Welcome! Deposit funds to get started.");
        boolean active = true;
        while (active)
        if (inputPin == userPin) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Current Balance");
            System.out.println("4. Quit");

            Scanner inputAction = new Scanner(System.in);
            double action = inputAction.nextDouble();
                if (action == 1) {
                    deposit();
                }
                if (action == 2) {
                    withdraw();
                }
                if (action == 3) {
                    balance();
                }
                if (action == 4) {
                    System.out.println("Goodbye!");
                    active = false;
                }
            }
        else {
            System.out.println("Invalid pin. Try again.");
            active = false;
        }
    }
    static private double accountBalance = 0;
    static DecimalFormat decimal = new DecimalFormat("##.00");

    public static void deposit() {
        System.out.print("Enter amount you would like to deposit $");
        Scanner input = new Scanner(System.in);
        double depositAmount = input.nextDouble();
        System.out.println("You deposited $" + depositAmount + "!");
        accountBalance += depositAmount;
    }
    public static void withdraw() {
        System.out.print("Enter amount you would like to withdraw $");
        Scanner input = new Scanner(System.in);
        double withdrawAmount = input.nextDouble();
        System.out.println("You have withdrawn $" + withdrawAmount + ".");
        accountBalance -= withdrawAmount;
    }
    public static void balance() {
        System.out.println("Current balance: $" + decimal.format(accountBalance));
    }
}

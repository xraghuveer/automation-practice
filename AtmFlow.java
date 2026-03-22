import java.util.Scanner;
import java.util.Random;

public class AtmFlow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // 5-digit balance with decimals
        double balance = rand.nextInt(10000, 100000) + rand.nextDouble();

        System.out.println("Insert Debit Card...");
        System.out.println("Select Service:");
        System.out.println("1. Withdrawal");
        System.out.println("2. Account Balance");
        System.out.println("3. Cancel");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter 4-digit PIN: ");
            int pin = sc.nextInt();

            if (pin < 1000 || pin > 9999) {
                System.out.println("Invalid PIN. PIN must be exactly 4 digits.");
            } 
            else if (pin != 1234) {
                System.out.println("Incorrect PIN.");
            } 
            else {
                System.out.print("Enter Amount: ");
                int amount = sc.nextInt();

                if (amount > 10000 || amount % 1000 != 0) {
                    System.out.println("Invalid amount. Must be <= 10000 and multiple of 1000.");
                } 
                else if (amount > balance) {
                    System.out.println("Insufficient Balance.");
                } 
                else {
                    balance = balance - amount;

                    System.out.println("Withdrawal Successful!");
                    System.out.printf("Amount Withdrawn: %.2f\n", (double) amount);
                    System.out.printf("Remaining Balance: %.2f\n", balance);
                }
            }
        }

        else if (choice == 2) {
            System.out.print("Enter 4-digit PIN: ");
            int pin = sc.nextInt();

            if (pin < 1000 || pin > 9999) {
                System.out.println("Invalid PIN. PIN must be exactly 4 digits.");
            } 
            else if (pin != 1234) {
                System.out.println("Incorrect PIN.");
            } 
            else {
                System.out.printf("Your Account Balance is: %.2f\n", balance);
            }
        }

        else if (choice == 3) {
            System.out.println("Transaction Cancelled.");
        }

        else {
            System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}

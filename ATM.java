import java.util.Scanner;

public class ATM {
    private static double balance = 5000; // Initial balance

    public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
		        int choice;

		        while (true) {
		            System.out.println("ATM Menu");
		            System.out.println("1. Check Balance");
		            System.out.println("2. Withdraw Cash");
		            System.out.println("3. Deposit Cash");
		            System.out.println("4. Quit");
		            System.out.print("Enter your choice: ");
		            choice = scn.nextInt();

		            switch (choice) {
		                case 1:
		                    checkBalance();
		                    break;
		                case 2:
		                    System.out.print("Enter the amount to withdraw: ");
		                    double withdrawAmount = scn.nextDouble();
		                    withdrawCash(withdrawAmount);
		                    break;
		                case 3:
		                    System.out.print("Enter the amount to deposit: ");
		                    double depositAmount = scn.nextDouble();
		                    depositCash(depositAmount);
		                    break;
		                case 4:
		                    System.out.println("Thank you for using the ATM. Goodbye!");
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }

		    private static void checkBalance() {
		        System.out.println("Your current balance is: $" + balance);
		    }

		    private static void withdrawCash(double amount) {
		        if (amount > balance) {
		            System.out.println("Insufficient funds. Please try again.");
		        } else {
		            balance -= amount;
		            System.out.println("Amount withdrawn: $" + amount);
		            System.out.println("Remaining balance: $" + balance);
		        }
		    }

		    private static void depositCash(double amount) {
		        balance += amount;
		        System.out.println("Amount deposited: $" + amount);
		        System.out.println("Updated balance: $" + balance);
    }
    
}

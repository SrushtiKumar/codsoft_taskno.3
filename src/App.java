import java.util.Scanner;
import java.lang.System;
public class App {

        private static UserBankAccount account = new UserBankAccount(1000);
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n*******ATM MACHINE INTERFACE********\n");
            System.out.println("The user can withdraw, deposit any desired amount and can also check account balance.");
            System.out.println("The user account present has an initial balance of :1000.\n");
            System.out.println("Enter user id :");
            int id = sc.nextInt();
            if(id==455){
            while (true) {
                System.out.println("\nATM Machine");
                System.out.println("1. Withdraw \n2. Deposit \n3. Check Balance \n4. Exit bank account\n");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter the amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        if (withdrawAmount > account.getBalance()) {
                            System.out.println("Insufficient balance. Amount specified cannot be withdrawn.");
                        } else {
                            account.withdraw(withdrawAmount);
                            System.out.println("Amount withdrawn successfully.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter the amount to deposit: ");
                        int depositAmount = sc.nextInt();
                        account.deposit(depositAmount);
                        System.out.println("Amount deposited successfully.");
                        break;
                    case 3:
                        System.out.println("Your current balance is: " + account.getBalance());
                        break;
                    case 4:
                        System.exit(0);//control comes out of while loop
                    default:
                        System.out.println("Invalid choice. Please enter choice between 1 and 4.");
                }
                
            }
            //sc.close();
            //with this above statement in code the system was showing compilation error; that is why the above statement eventhough necessary, is commented
        }
        else{
            System.out.println("The id entered does not exist !!");
        }
        
    }
}
    
    class UserBankAccount {
        private int balance;
    
        public UserBankAccount(int balance) {//parameterized constructor
            this.balance = balance;
        }
    
        public int getBalance() {
            return balance;
        }
    
        public void withdraw(int amount) {
            balance -= amount;
        }
    
        public void deposit(int amount) {
            balance += amount;
        }
    }
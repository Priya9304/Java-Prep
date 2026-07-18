import java.util.Scanner;
class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int balance = 5000;
		
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
		
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        if (name.equals("Pallavi") &&
            email.equals("pallavi123@gmail.com")){
				
            Login(name, email);
			
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
			
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            if (choice == 1) {

                if (amount <= balance) {
                    withdraw(12345, amount);
                    balance -= amount;
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else if (choice == 2) {
                deposit(amount);
                balance += amount;
            } else {
                System.out.println("Invalid Choice");
            }
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid Credentials");
        }
        sc.close();
    }
    public static void Login(String name, String email) {

        System.out.println("\nLogin Successful");
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
    }
    public static void withdraw(int account_num, int amount) {

        System.out.println("Account Number : " + account_num);
        System.out.println("Amount Withdraw : " + amount);
    }
    public static void deposit(int amount) {
        System.out.println("Amount Deposited : " + amount);
    }
}
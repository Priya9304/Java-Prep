import java.util.Scanner;

class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        sc.nextLine(); 
		
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (name.equals("Pallavi") &&
            email.equals("pallavi123@gmail.com")) {
            Login(name, email);
            if (amount <= balance) {
                withdraw(12345, amount);
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Invalid Credentials");
        }
        sc.close();
    }
    public static void Login(String name, String email) {
        System.out.println(name);
        System.out.println(email);
        System.out.println("Login successful...");
    }
    public static void withdraw(int account_num, int amount) {
        System.out.println("Account Number : " + account_num);
        System.out.println("Amount Withdraw : " + amount);
    }
    public static void deposit(int amount) {

        System.out.println("Amount Deposited : " + amount);
    }
}
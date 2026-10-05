public class BankAccount {

    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.balance = 1000;

        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();
    }
}
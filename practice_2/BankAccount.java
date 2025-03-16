package practice_2;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return owner;
    }

    double getBalance() {
        return balance;
    }

    void setOwner(String newOwner) {
        owner = newOwner;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void printBalance() {
        System.out.println("Your balance: " + balance + "$");
    }


    public static void main(String[] args) {
        BankAccount john = new BankAccount("John",0);
        john.printBalance();

        john.deposit(10000);
        john.printBalance();

        john.withdraw(2000);
        john.printBalance();


    }
}

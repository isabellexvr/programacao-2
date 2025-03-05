package bank;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    void deposit(double amount) throws Exception {

        this.balance += amount;
    }

    double getBalance() {
        return this.balance;
    }

    void withdraw(double amount) throws Exception {
        if (amount > this.withdrawLimit) {
            throw new Exception("The amount exceeds withdraw limit");
        }else if(amount > this.balance) {
            throw new Exception("Not enough balance");
        }
        this.balance -= amount;
    }
}

package junit_problems.advance_junit.banking_transaction;

public class BankAccount {
    private double balance = 1000;

    public double deposite(double amount){
        balance = balance+amount;
        return balance;
    }
    public double withdraw(double amount){
        if(amount<=balance) {
            balance = balance - amount;
        }
        return balance;
    }
    public double getBalance(){
        return balance;
    }
}

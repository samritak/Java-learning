// Interface
interface Transaction {
 void deposit(double amount);
 void withdraw(double amount);
}
// Implementing class for Savings Account
class SavingsAccount implements Transaction {
 private double balance;
 private double interestRate;
 public SavingsAccount(double balance, double interestRate) {
 this.balance = balance;
 this.interestRate = interestRate;
 }
 @Override
 public void deposit(double amount) {
 balance += amount + (amount * interestRate / 100);
 System.out.println("Deposited: " + amount + " with interest. New Balance: " + balance);
 }
 @Override
 public void withdraw(double amount) {
 if (amount <= balance) {
 balance -= amount;
 System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
 } else {
 System.out.println("Insufficient balance.");
 }
 }
  public double getBalance() {
 return balance;
 }
}


// Implementing class for Current Account
class CurrentAccount implements Transaction {
 private double balance;
 private double overdraftLimit;
 public CurrentAccount(double balance, double overdraftLimit) {
 this.balance = balance;
 this.overdraftLimit = overdraftLimit;
 }
 @Override
 public void deposit(double amount) {
 balance += amount;
 System.out.println("Deposited: " + amount + ". New Balance: " + balance);
 }
 @Override
 public void withdraw(double amount) {
 if (amount <= balance + overdraftLimit) {
 balance -= amount;
 System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
 } else {
 System.out.println("Overdraft limit exceeded.");
 }
 }

// Getters
 public double getBalance() {
 return balance;
 }
}
// Main class
public class BankingSystem {
 public static void main(String[] args) {
 SavingsAccount savings = new SavingsAccount(1000, 5);
 CurrentAccount current = new CurrentAccount(500, 1000);
 savings.deposit(500);
 current.withdraw(700);
 System.out.println("Savings Account Balance: " + savings.getBalance());
 System.out.println("Current Account Balance: " + current.getBalance());
 }
}
 

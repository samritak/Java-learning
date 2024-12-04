// Superclass
class BankAccount {
 protected double balance;
 public BankAccount(double balance) {
 this.balance = balance;
 }
 public void deposit(double amount) {
 balance += amount;
 System.out.println("Deposited: " + amount);
 }
 public void withdraw(double amount) {
 balance -= amount;
 System.out.println("Withdrew: " + amount);
 }
 public double getBalance() {
 return balance;
 }
}

// Subclass
class SavingsAccount extends BankAccount {
 private double interestRate;
 public SavingsAccount(double balance, double interestRate) {
 super(balance);
 this.interestRate = interestRate;
 }
 @Override
 public void deposit(double amount) {
 balance += amount + (amount * interestRate / 100);
 System.out.println("Deposited: " + amount + " with interest");
 }
 // Getters and Setters
 public double getInterestRate() {
 return interestRate;
 }
}

// Main class
public class BankingSystem {
 public static void main(String[] args) {
 BankAccount account = new BankAccount(1000);
 SavingsAccount savings = new SavingsAccount(1000, 5);
 account.deposit(500); // Calls deposit in BankAccount
 savings.deposit(500); // Calls overridden deposit in SavingsAccount
 System.out.println("BankAccount balance: " + account.getBalance());
 System.out.println("SavingsAccount balance: " + savings.getBalance());
 }
}

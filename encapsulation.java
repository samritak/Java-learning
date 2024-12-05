//This code may give error because two public class in same file is not accepted.

public class BankAccount {
 private String accountNumber;
 private double balance;
 
 public BankAccount(String accountNumber) {
 this.accountNumber = accountNumber;
 this.balance = 0.0; // Default balance
 }
 // Getter and setter for balance
 public double getBalance() {
 return balance;
 }

public void deposit(double amount) {
 if (amount > 0) {
 balance += amount;
 System.out.println("Deposited: " + amount);
 } else {
 System.out.println("Deposit amount must be positive.");
 }
 }
 public void withdraw(double amount) {
 if (amount > 0 && amount <= balance) {
 balance -= amount;
 System.out.println("Withdrew: " + amount);
 } else {
 System.out.println("Invalid withdrawal amount.");
 }
 }
}
// Main class
public class BankingSystem {
 public static void main(String[] args) {
 BankAccount account = new BankAccount("1234567890");
 account.deposit(500.0);
 account.withdraw(200.0);
 //System.out.println("Account Number: " + account.getAccountNumber());
 System.out.println("Balance: " + account.getBalance());
 }
}

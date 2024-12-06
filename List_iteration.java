import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Transaction {
 private String type;
 private double amount;
 public Transaction(String type, double amount) {
 this.type = type;
 this.amount = amount;
 }
 public String getType() {
 return type;
 }
 public double getAmount() {
 return amount;
 }
 @Override
 public String toString() {
 return "Transaction Type: " + type + ", Amount: " + amount;
 }
}
public class BankingSystem {
 public static void main(String[] args) {
 List<Transaction> transactions = new ArrayList<>();
 transactions.add(new Transaction("Deposit", 1000));
 transactions.add(new Transaction("Withdraw", 500));
 transactions.add(new Transaction("Deposit", 2000));
 // Using enhanced for loop
 System.out.println("Using enhanced for loop:");
 for (Transaction transaction : transactions) {
     System.out.println(transaction);
 }
 // Using iterator
 System.out.println("\nUsing iterator:");
 Iterator<Transaction> iterator = transactions.iterator();
 while (iterator.hasNext()) {
 System.out.println(iterator.next());
 }
 // Using forEach with lambda expression
 System.out.println("\nUsing forEach with lambda:");
 transactions.forEach(transaction -> System.out.println(transaction));
 }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class BankTransaction implements Runnable {
 private String transactionType;
private double amount;
 public BankTransaction(String transactionType, double amount) {
 this.transactionType = transactionType;
 this.amount = amount;
 }
 @Override
 public void run() {
 System.out.println(Thread.currentThread().getName() + " processing " + transactionType + " of " + amount);
 // Simulate transaction processing time
 try {
 Thread.sleep(1000);
} catch (InterruptedException e) {
 System.out.println("Transaction interrupted: " + e.getMessage());
 }
 System.out.println(Thread.currentThread().getName() + " completed " + transactionType);
 }
}


public class BankingSystem {
 public static void main(String[] args) {
 ExecutorService executor = Executors.newFixedThreadPool(3);
 executor.submit(new BankTransaction("Deposit", 1000));
 executor.submit(new BankTransaction("Withdraw", 500));
 executor.submit(new BankTransaction("Deposit", 2000));
 executor.submit(new BankTransaction("Withdraw", 1500));
 executor.submit(new BankTransaction("Deposit", 3000));
 executor.shutdown();
 }
}

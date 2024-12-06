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
 Thread teller1 = new Thread(new BankTransaction("Deposit", 1000), "Teller 1");
 Thread teller2 = new Thread(new BankTransaction("Withdraw", 500), "Teller 2");
teller1.start();
 teller2.start();
 }
}

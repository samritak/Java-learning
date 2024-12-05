

import java.util.HashSet;
import java.util.Set;
public class BankingSystem {
 public static void main(String[] args) {
 Set<String> accountNumbers = new HashSet<>();
 accountNumbers.add("1234567890");
accountNumbers.add("0987654321");
 accountNumbers.add("1234567890"); // Duplicate entry, will not be added
 System.out.println("Unique account numbers:");
 for (String accountNumber : accountNumbers) {
 System.out.println(accountNumber);
 }
 // Check if an account number exists
 String searchAccount = "0987654321";
 if (accountNumbers.contains(searchAccount)) {
 System.out.println("Account number " + searchAccount + " exists.");
 } else {
 System.out.println("Account number " + searchAccount + " does not exist.");
 }
 // Remove an account number
 accountNumbers.remove("0987654321");
 System.out.println("Account numbers after removal:");
 for (String accountNumber : accountNumbers) {
 System.out.println(accountNumber);
 }
 }
}
 

// Interface 1
interface Borrowable {
 void borrowItem(String item);
}
// Interface 2
interface Returnable {
 void returnItem(String item);
}
// Implementing class
class LibraryMember implements Borrowable, Returnable {
 private String memberId;
 private String name;
 public LibraryMember(String memberId, String name) {
 this.memberId = memberId;
 this.name = name;
 }
 @Override
 public void borrowItem(String item) {
 System.out.println(name + " borrowed " + item);
 }
 @Override
 public void returnItem(String item) {
 System.out.println(name + " returned " + item);
 }
 // Getters and Setters
 public String getMemberId() {
 return memberId;
 }
 public String getName() {
 return name;
 }
}
// Main class
public class LibrarySystem {
 public static void main(String[] args) {
 LibraryMember member = new LibraryMember("L001", "Alice");
 member.borrowItem("Introduction to Java Programming");
 member.returnItem("Introduction to Java Programming");
 }
}

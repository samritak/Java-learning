
 // Interface
interface Borrowable {
 void borrowItem(String item);
}
// Abstract class
abstract class LibraryMember {
 private String memberId;
 private String name;
 public LibraryMember(String memberId, String name) {
 this.memberId = memberId;
 this.name = name;
 }
 abstract void attendEvent(String eventName); // Abstract method
 void showMemberInfo() { // Concrete method
 System.out.println("Member ID: " + memberId + ", Name: " + name);
 }
 
 public String getName() {
 return this.name;
 }
 
}
// Subclass
class StudentMember extends LibraryMember implements Borrowable {
 private String gradeLevel;
 public StudentMember(String memberId, String name, String gradeLevel) {
 super(memberId, name);
 this.gradeLevel = gradeLevel;
 }
 
@Override
 void attendEvent(String eventName) {
 System.out.println(getName() + " is attending " + eventName);
 }
 @Override
 public void borrowItem(String item) {
 System.out.println(getName() + " borrowed " + item);
 }
 // Getters
 public String getName() {
 return super.getName();
 }
}
// Main class
public class LibrarySystem {
 public static void main(String[] args) {
 StudentMember student = new StudentMember("S001", "Alice", "Grade 10");
 student.showMemberInfo(); // Calls concrete method from LibraryMember
 student.borrowItem("Java Programming");
 student.attendEvent("Tech Talk");
 }
}

public class LibraryMember {
 private String memberId;
 private String name;
 public LibraryMember(String memberId, String name) {
 this.memberId = memberId;
 this.name = name;
 }
 public void borrowBook() {
 System.out.println(name + " is borrowing a book.");
 }
public String getMemberId() {
 return memberId;
 }
 public String getName() {
 return name;
 }
}

public class StudentMember extends LibraryMember {
 private String gradeLevel;
 public StudentMember(String memberId, String name, String gradeLevel) {
 super(memberId, name);
 this.gradeLevel = gradeLevel;
 }
 public void attendClass() {
 System.out.println(getName() + " is attending class.");
 }
 public String getGradeLevel() {
 return gradeLevel;
 }
}

public class LibrarySystem {
 public static void main(String[] args) {
 StudentMember student = new StudentMember("S001", "Alice", "Grade 
10");
 student.borrowBook(); // Inherited from LibraryMember
 student.attendClass(); // Defined in StudentMember
 }
}

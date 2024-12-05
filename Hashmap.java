import java.util.HashMap;
import java.util.Map;
public class LibrarySystem {
 public static void main(String[] args) {
 Map<String, String> books = new HashMap<>();
 books.put("Effective Java", "Joshua Bloch");
 books.put("Java Concurrency in Practice", "Brian Goetz");
 books.put("Clean Code", "Robert C. Martin");
 System.out.println("Books in the library:");
 for (Map.Entry<String, String> entry : books.entrySet()) {
 System.out.println("Title: " + entry.getKey() + ", Author: " + 
entry.getValue());
 }

// Lookup an author by book title
 String title = "Effective Java";
 if (books.containsKey(title)) {
 System.out.println("The author of " + title + " is " + 
books.get(title));
 } else {
 System.out.println(title + " is not in the library.");
}
 // Remove a book by title
 books.remove("Java Concurrency in Practice");
 System.out.println("Books after removal:");
 for (Map.Entry<String, String> entry : books.entrySet()) {
 System.out.println("Title: " + entry.getKey() + ", Author: " + 
entry.getValue());
 }
 }
}

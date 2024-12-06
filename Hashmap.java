

import java.util.HashMap;
import java.util.Map;
public class LibrabySystem {
public static void main(String[] args) {
Map<String , String> books = new HashMap<>();

books.put("Book1","Author1");
books.put("Book2","Author2");
books.put("Book3","Author3");

 System.out.println("Books in Library are :");
 for (Map.Entry<String, String> entry : books.entrySet()) {
 System.out.println("Title is "+entry.getKey()+", Author is "+entry.getValue());
 }

String title ="Book2";
if (books.containsKey(title)){
    System.out.println("\nFound the book: "+books.get(title));
}
else{
    System.out.println("\nBook is not present");
}

books.remove("Book2");

 System.out.println("After removed books in Library are :");
 for (Map.Entry<String, String> entry : books.entrySet()) {
 System.out.println("Title is "+entry.getKey()+", Author is "+entry.getValue());
 }
 }
}

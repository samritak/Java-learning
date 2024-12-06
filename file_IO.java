import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LibrarySystem {
 public static void main(String[] args) {
 String inputFile = "/uploads/books.txt";
 String outputFile = "book_titles.txt";
 try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
 String line;
 while ((line = reader.readLine()) != null) {
     System.out.println(line);
 String[] bookDetails = line.split(",");
 String title = bookDetails[0];
 writer.write(title);
 writer.newLine();
 }
 System.out.println("\nBook titles have been written to " + outputFile);
 } catch (IOException e) {
 System.out.println("An error occurred: " + e.getMessage());
 }
 }
}

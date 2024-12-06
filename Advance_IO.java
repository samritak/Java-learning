import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;
public class LibrarySystem {
 public static void main(String[] args) {
 Path inputFilePath = Paths.get("books.txt");
 Path outputFilePath = Paths.get("book_titles_nio.txt");
 try {
 // Read all lines from the input file
 List<String> lines = Files.readAllLines(inputFilePath, StandardCharsets.UTF_8);
 // Write only the book titles to the output file
 Files.write(outputFilePath, lines, StandardCharsets.UTF_8);
 System.out.println("Book titles have been written to " + outputFilePath);
 } catch (IOException e) {
 System.out.println("An error occurred: " + e.getMessage());
 }
 }
}

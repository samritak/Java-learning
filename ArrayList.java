import java.util.ArrayList;
import java.util.List;

class Book {
 private String title;
 private String author;
 private String isbn;
 public Book(String title, String author, String isbn) {
 this.title = title;
 this.author = author;
 this.isbn = isbn;
 }
 public String getTitle() {
 return title;
 }

public String getAuthor() {
 return author;
 }
 public String getIsbn() {
 return isbn;
 }
 @Override
 public String toString() {
 return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
 }
}
public class LibrarySystem {
 public static void main(String[] args) {
List<Book> books = new ArrayList<>();
 books.add(new Book("Effective Java", "Joshua Bloch", "978-0134685991"));
 books.add(new Book("Java Concurrency in Practice", "Brian Goetz", 
"978-0321349606"));
 books.add(new Book("Clean Code", "Robert C. Martin", "978-0132350884"));
 // Display all books in the library
 for (Book book : books) {
 System.out.println(book);
 }
 
 // Find and display a book by title
String searchTitle = "Clean Code";
 for (Book book : books) {
 if (book.getTitle().equals(searchTitle)) {
 System.out.println("Found: " + book);
 }
 }
 // Remove a book by ISBN
 String removeIsbn = "978-0134685991";
 books.removeIf(book -> book.getIsbn().equals(removeIsbn));
 System.out.println("Books after removal:");
 for (Book book : books) {
 System.out.println(book);
 }
 }
}

/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
abstract class Person {
	 private String name;
	 private int id;

	 public Person(String name, int id) {
	     this.name = name;
	     this.id = id;
	 }

	 public String getName() {
	     return name;
	 }

	 public int getId() {
	     return id;
	 }

	 // Abstract method to be implemented by subclasses
	 public abstract void displayInfo();
	}

	//Librarian class (Inheritance & Polymorphism)
	class Librarian extends Person {
	 public Librarian(String name, int id) {
	     super(name, id);
	 }

	 @Override
	 public void displayInfo() {
	     System.out.println("Librarian Name: " + getName() + ", ID: " + getId());
	 }

	 public void addBook(Book book) {
	     System.out.println("Librarian " + getName() + " added the book: " + book.getTitle());
	 }
	}

	//User class (Inheritance & Polymorphism)
	class User extends Person {
	 private Book borrowedBook; 

	 public User(String name, int id) {
	     super(name, id);
	 }

	 @Override
	 public void displayInfo() {
	     System.out.println("User Name: " + getName() + ", ID: " + getId());
	 }

	 public void borrowBook(Book book) {
	     if (borrowedBook == null) {
	         borrowedBook = book;
	         System.out.println(getName() + " borrowed: " + book.getTitle());
	     } else {
	         System.out.println(getName() + " already has a book: " + borrowedBook.getTitle());
	     }
	 }

	 public void returnBook() {
	     if (borrowedBook != null) {
	         System.out.println(getName() + " returned: " + borrowedBook.getTitle());
	         borrowedBook = null;
	     } else {
	         System.out.println(getName() + " has no book to return.");
	     }
	 }
	}

	//Book class (Encapsulation)
	class Book {
	 private String title;
	 private String author;

	 public Book(String title, String author) {
	     this.title = title;
	     this.author = author;
	 }

	 public String getTitle() {
	     return title;
	 }

	 public String getAuthor() {
	     return author;
	 }

	 public void displayInfo() {
	     System.out.println("Book Title: " + title + ", Author: " + author);
	 }
	}

	//Main class
	public class Library {
	 public static void main(String[] args) {
	     Librarian librarian = new Librarian("Sree",197);
	     User user = new User("Latha", 02);
	     Book book1 = new Book("History", "Ramachandra Guha");

	     librarian.displayInfo();
	     user.displayInfo();
	     book1.displayInfo();

	     // Librarian adds a book
	     librarian.addBook(book1);

	     // User borrows and returns a book
	     user.borrowBook(book1);
	     user.returnBook();
	 }
	}
// Compilation: javac filename.java
// Run: java Exaple1
// Runnable class: a class that contains main method
// Normal: a class that doesn't contain main
// Modifier
class Book {
  // Instance variables
  String name; // null
  String author; // null
  double price; // 0.0
  int yearOfPublication;
  // Instance mehtod
  void printBookDetails() {
    System.out.println("Name: " + name);
    System.out.println("Author: " + author);
    System.out.printf("Price: %.2f\n", price);
    System.out.println("Year published: " + yearOfPublication);
  }
}
class Example1 {
  public static void main(String[] args) {
    Book book1 = new Book();
    book1.printBookDetails();
    book1.name = "Wings of Fire";
    book1.author = "Abdul Kalam";
    book1.price = 900.50;
    book1.yearOfPublication = 1996;
    book1.printBookDetails();
    Book book2 = new Book();
    book2.printBookDetails();
  }
}
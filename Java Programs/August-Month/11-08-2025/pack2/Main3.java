package pack2;
import pack1.Student;
import java.util.Scanner;

public class Main3 {
  // Create student object
  public static void main(String[] args) {
    Student s1 = new Student("Alice", 17, 6.8);
    System.out.println(s1.age);
    System.out.println(s1.name);
    System.out.println(s1.cgpa);
    Scanner sc = new Scanner(System.in);
    System.out.println(Math.sqrt(25));
    String s = "hello";
    System.out.println(s.toUpperCase());
  }
}

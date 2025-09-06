class Student {
  String name;
  int age;
  double cgpa;

  public Student(String name, int age, double cgpa) {
    this.name = name; // using this keyword to distinguish between the local and instance variables
    this.age = age;
    this.cgpa = cgpa;
  }
  // Proving this keyword represents the current object
  void xyz() {
    System.out.println(this);
  }
}
public class UseOfThisKeyword {
  public static void main(String[] args) {
    Student s1 = new Student("Bob", 17, 2.2);
    s1.xyz(); // prints the same id (hashcode) s2
    System.out.println(s1); // prints the hashcode of s1

    Student s2 = new Student("Alice", 19, 6.7);
    s2.xyz(); // prints the same id (hashcode) of s2
    System.out.println(s2); // hashcode of s2
  
  }
}

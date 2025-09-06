// Constructor Overloading
// Method overloading
// Writing method with same name, but different 
// signatures
// 1. changing no. of parameters
// 2. changing type of parameters
// 3. changing order of parameters
class Student {
  // Instance variables
  String name;
  int age;
  double cgpa;
  // constructor 1 (no parametric)
  Student() {

  }
  // Constructor2 (Parametric)
  Student(String n, int a, double c) {
    this.name = n;
    this.age = a;
    this.cgpa = c;
  }
  // Constructor 3
  Student(String n, double c) {
    name = n;
    cgpa = c;
  }
  // Constructor 4
  Student(double c, String n) {
    name = n;
  }
  // Constructor 5
  Student(String x) {
    name = x;
  }
  // Constructor 6
  Student(int a) {
    age = a;
  }
  // instance method
  void printDetails() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(cgpa);
  }
}
public class Example8 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.printDetails();
    Student s2 = new Student("pavan", 17, 9.9);
    s2.printDetails();
    Student s3 = new Student("Kiran");
    s3.age = 24;
    s3.cgpa = 7.7;
    s3.printDetails();
    Student s4 = new Student();

  }
}

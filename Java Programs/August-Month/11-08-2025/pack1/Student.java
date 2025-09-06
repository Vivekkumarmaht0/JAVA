package pack1;
// class members
public class Student {
  // Instance variables
  public String name; // -- default access modifier
  public int age;
  public double cgpa;
  // parametric constructor
  public Student(String name, int age, double cgpa) {
    this.name = name;
    this.age = age;
    this.cgpa = cgpa;
  }
  // method to displaystudentinfo
  void displayStudentInfo() {
    System.out.println("Name is: " + name);
    System.out.println("Age is: " + age);
    System.out.println("CGPA is: " + cgpa);
  }
}

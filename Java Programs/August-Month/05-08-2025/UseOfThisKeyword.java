class Student {
  String name;
  int age;
  double cgpa;

  public Student(String name, int age, double cgpa) {
    this.name = name;
    this.age = age;
    this.cgpa = cgpa;
  }

  void xyz() {
    System.out.println(this);
  }
}
public class UseOfThisKeyword {
  public static void main(String[] args) {
    Student s1 = new Student("xyz", 17, 2.2);
    s1.xyz();
    System.out.println(s1);
  
  }
}

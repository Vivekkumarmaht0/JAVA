// Passing objects are arguments to methods
class Employee {
  int id;
  double salary;
  Employee(int id, double salary) {
    this.id = id;
    this.salary = salary;
  }
}
public class ObjectsAsArguments {
  static void fun(Employee e1, Employee e2) {
    if (e1.salary > e2.salary) {
      System.out.println("First employee is earning more");;
    } else {
      System.out.println("Second employee is earning more");
    }
  }
  public static void main(String[] args) {
    Employee firstEmployee = new Employee(1, 50000);
    Employee secondEmployee = new Employee(1, 70000);
    fun(firstEmployee, secondEmployee);
  }  
}

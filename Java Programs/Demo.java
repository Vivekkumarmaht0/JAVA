public class Demo {
  public static void main(String[] args) {
    int a = 10;
    int b = 3;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b); // 3
    System.out.println(a * 1.0 / b);
    System.out.println(a % b);
    System.out.println(a > b);
    boolean result = a < b;
    System.out.println(result);
    // Logical operators are used to combine two or
    // more relational expressions
    a = 10;
    b = 3;
    int c = 5;
    int d = 7;
    System.out.println(a > b && c != d);
  }
}

public class UserDefinedMethods1 {
  // non-static (instance) method
  int getSum(int a, int b) {
    return a + b;
  }
  // static-method
  static int getProduct(int a, int b) {
    return a * b;
  }
  public static void main(String[] args) {
    // Calling a non-static method (2 step process)
    UserDefinedMethods1 u1 = new UserDefinedMethods1();
    System.out.println(u1.getSum(10, 20));

    // Calling a static method (direct)
    System.out.println(getProduct(10, 20));
  }
}

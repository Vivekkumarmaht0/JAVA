public class MethodsWithVariableSizedArguments {
  static void add(int ... A) {
    // the value you send will be stored in A as array
    // of the data type provided
    int sum = 0;
    for (int eachElement: A) {
      sum += eachElement;
    }
    System.out.println(sum);
  }
  public static void main(String[] args) {
    add(100, 200);  // {100, 200} A
    add(100); // {100} A
    add(100, 200, 300); // {100, 200, 300} A
    add(100, 200, 300, 400, 500, 600); // {100, 200,}
  }
}

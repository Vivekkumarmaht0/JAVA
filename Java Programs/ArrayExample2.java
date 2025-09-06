public class ArrayExample2 {
  public static void main(String[] args) {
    // How to initialize an array
    int[] arr = {10, 20, 30, 40, 50, 60};
    //           0   1   2   3   4   5
    // Length of array can be obtained using arr_name.length
    System.out.println(arr.length);
    System.out.println(arr[5]);
    for (int i = 0; i <  arr.length; i++) {
      System.out.println(i + "-->" + arr[i]);
    }
    // System.out.println(arr[6]); -> Out of bounds error

    String[] names  = {"harry", "ron", "heromine"};
    //                   0        1        2
    for (int i = names.length -  1; i >= 0; i--) {
      System.out.println(names[i]);
    }
    System.out.println(names.length);
    System.out.println(names[2]);
  }
}

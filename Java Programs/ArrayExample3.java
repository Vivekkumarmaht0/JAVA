import java.util.Scanner;

public class ArrayExample3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // reading array lentgh
    // Declare an array of length n
    int[] arr = new int[n];
    // Reading array elements
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    // Running the same loop to access all array
    // elements
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] * arr[i]);
    }
  }
}

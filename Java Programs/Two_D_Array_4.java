import java.util.Scanner;
public class Two_D_Array_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // dimensions
    int r = sc.nextInt(); // rows
    int c = sc.nextInt(); // columns
    // declaration
    int[][] mat = new int[r][c];
    // reading values into matrix
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    // row wise sum of matrix
    for (int i = 0; i < r; i++) {
      int sum = 0;
      for (int j = 0; j < c; j++) {
        sum += mat[i][j];
      }
      System.out.println(sum);
    }

    // row wise sum of matrix
    for (int[] eachArray: mat) {
      int sum = 0;
      for (int eachValue: eachArray) {
        sum += eachValue;
      }
      System.out.println(sum);
    }
  }
}

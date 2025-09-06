// variable sized arrays
// arrays of varying lengths
import java.util.Arrays;
public class Variable_Sized_Arrays2 {
  public static void main(String[] args) {
    int[][] mat = new int[3][];
    mat[0] = new int[5]; // 1st 1-D array will have 5 integers
    mat[1] = new int[10]; // 2nd 1-D array will have 10 integers
    mat[2] = new int[30]; // 3rd 1-D array will have 30 integers
    for (int i = 0; i < mat.length; i++) {
      System.out.println(Arrays.toString(mat[i]));
    }
    System.out.println(Arrays.deepToString(mat));
  }
}

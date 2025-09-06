public class Two_D_Array_1 {
  public static void main(String[] args) {
    // MultiDimesional array syntax:
    // datatype[][] array_name = new datatype[r][c]; -- 2d
    // datatype[][][] arr_name = new datatype[x][y][z]; -- 3d
    //                 0  1     0   1     0   1
      int[][] arr = {{10, 20}, {30, 40}, {50, 60}};
      //                0          1         2
      // it's 3 x 2 matrix
      System.out.println(arr.length); // 3
      System.out.println(arr[1][1]);  // 40
      System.out.println(arr[0][1]); // 20
      // outer loop on rows
      for (int i = 0; i < arr.length; i++) {
        // inner loop on columns
        for (int j = 0; j < arr[i].length; j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
  }
}

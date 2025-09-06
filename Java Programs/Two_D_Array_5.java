public class Two_D_Array_5 {
  public static void main(String[] args) {
    // Running for each loop on a 2-D array
    int[][] A = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
    // each element in 2-D array is a 1-D array of integers
    for (int[] eachArray: A) {
      for (int eachValue: eachArray) {
        System.out.println(eachValue);
      }
    }
    String[][] names = {{"alice", "bob"}, 
                      {"david", "charlie"}, 
                      {"frank", "garry"}};
    for (String[] eachStringArray: names) {
      for (String eachName: eachStringArray) {
        System.out.print(eachName + " ");
      }
      System.out.println();
    }
    
  }
}

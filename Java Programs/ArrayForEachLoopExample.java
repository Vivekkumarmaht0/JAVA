public class ArrayForEachLoopExample {
  public static void main(String[] args) {
    // For-each loop
    // Used to run loop on collections
    // directly on values
    // for (d_type loop_variable: collection_name) {
        // body
      // }
      int[] A = {10, 20, 30};
      for (int eachValue: A) {
        System.out.println(eachValue * eachValue);
      }
      String[] names = {"alice", "bob", "charlie"};
      // Run a for each loop on names
      for (String eachName: names) {
        System.out.println(eachName.charAt(0));
      }
      
      
      

  }
}

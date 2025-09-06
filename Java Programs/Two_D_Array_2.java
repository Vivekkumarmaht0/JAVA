public class Two_D_Array_2 { // Go-to programming
  public static void main(String[] args) {
    // 3 1-D arrays
    String[]  moneyHeist = {"professor", "berlin", "tokyo"};
    String[] squidGame = {"player-456", "player-100", "player-222"};
    String[] breakingBad = {"walter", "jesse", "skyler"};
    // 1 2-D array
    String[][] webSeriesCast = {moneyHeist, squidGame, breakingBad};
    for (int i = 0; i  < webSeriesCast.length; i++) {
      for (int j = 0; j < webSeriesCast[i].length; j++) {
        System.out.print(webSeriesCast[i][j] + " ");
      }
      System.out.println();
    }
  }
}

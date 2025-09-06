public class SwitchExample4 {
  public static void main(String[] args) {
    int day = 3;
    String result = switch(day) {
      case 1, 2, 3, 4, 5 -> "Weekday";
      case 6, 7 -> "Weekend";
      default -> "Invalid day";
    };
    System.out.println(result);
  }
}

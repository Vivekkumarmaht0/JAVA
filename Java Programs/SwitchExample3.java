public class SwitchExample3 {
  public static void main(String[] args) {
    int day = 3;
    String result = switch(day) {
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 ->  "Wednesday";
      default -> "Invalid day";
    };
    System.out.println(result);
  }
}

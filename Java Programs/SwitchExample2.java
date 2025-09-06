public class SwitchExample2 {
  public static void main(String[] args) {
    String status = "open";
    switch(status) {
      case "Open":
        System.out.println("File is opened");
        break;
      case "Close":
        System.out.println("File is closed");
        break;
      default:
        System.out.println("Not a valid command");

    }
  }
}

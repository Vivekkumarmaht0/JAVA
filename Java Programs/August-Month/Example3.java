// name, director, music composer
// "dalapathy", "maniratnam", "ilyaraja"
class Rectangle {
  int length, breadth;
  // Parametric constructor
  Rectangle(int l, int b) {
    length = l;
    breadth = b;
  }
  void printDetails() {
    System.out.println("Length: " + length);
    System.out.println("Breadth: " + breadth);
  }
}
public class Example3 {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(3, 4);
    r1.printDetails();
  }
}

import java.util.Scanner;

class Point2D {
  // Instance variables
  int x;
  int y;
  // Constructor
  Point2D(int x, int y) {
    this.x = x;
    this.y = y;
  }
  double getDistance(Point2D that) {
    return Math.sqrt(Math.pow(that.x - this.x, 2) +
                    Math.pow(that.y - this.y, 2));
  }
}
class DistanceBetweenTwoPoints {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int x1 = read.nextInt();
    int y1 = read.nextInt();
    int x2 = read.nextInt();
    int y2 = read.nextInt();
    double d = Math.sqrt(Math.pow(x2 - x1, 2) + 
                        Math.pow(y2 - y1, 2));
  }
}
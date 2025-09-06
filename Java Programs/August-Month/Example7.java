import java.util.Scanner;

class Circle {
  // Instance variables
  double radius;
  // Constructor
  Circle(double r) {
    radius = r;
  }
  // Instance methrods
  double getArea() {
    return 3.14 * radius * radius;
  }
  double getPerimeter() {
    return 2 * 3.14 * radius;
  }
  double getDiameter() {
    return 2 * radius;
  }
}
public class Example7 {
  public static void main(String[] args) {
    // Circle c1 = new Circle(5.5);
    // System.out.println(c1.getArea());
    // System.out.println(c1.getPerimeter());
    // System.out.println(c1.getDiameter());
    // Circle c2 = new Circle(7.7);

    // Creating array of objects
    // Circle[] circles = {new Circle(10),
    //                     new Circle(20),
    //                   new Circle(5.5),
    //                 new Circle(2.2)};
    // System.out.println(circles.length);
    // System.out.println(circles[2].getArea());
    // for (int i = 0; i < circles.length; i++) {
    //   System.out.println("Details of Circle " + (i + 1));
    //   System.out.println(circles[i].radius);
    //   System.out.println(circles[i].getArea());
    //   System.out.println(circles[i].getPerimeter());
    //   System.out.println(circles[i].getDiameter());
    // }
    // for (Circle eachCircle: circles) {
    //   System.out.println(eachCircle.radius);
    //   System.out.println(eachCircle.getArea());
    //   System.out.println(eachCircle.getPerimeter());
    //   System.out.println(eachCircle.getDiameter());
    // }
    Scanner sc = new Scanner(System.in);
    // Tell me how many circles data would you provide
    int n;
    System.out.println("Enter number of circles: ");
    n = sc.nextInt();
    // An array of n Circles
    Circle[] circles = new Circle[n];
    // I need a space to store 10 circles
    // No memory will be allocated for each circle
    for (int i = 0; i < n; i++) {
      // Each circle is now created / memory will be allocated
      double x = sc.nextDouble();
      circles[i] = new Circle(x);
    }
    for (Circle c: circles) {
      System.out.println(c.radius);
      System.out.println(c.getArea());
      System.out.println(c.getPerimeter());
      System.out.println(c.getDiameter());
    }
  }
}

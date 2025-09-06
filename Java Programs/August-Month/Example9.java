class Triangle {
  private int a, b, c;
  public Triangle() {

  }
  public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }

  public void setC(int c) {
    this.c = c;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }

  
  
}
public class Example9 {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(1, 2, 3);
  }
}

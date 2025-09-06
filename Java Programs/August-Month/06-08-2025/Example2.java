class MyMath {
  private int a;
  private int b;
  MyMath(int a, int b) {
    this.a = a;
    this.b = b;
  }
  public void setA(int a) {
    this.a = a;
  }
  public int getA() {
    return a;
  }
  public void setB(int b) {
    this.b = b;
  }
  public int getB() {
    return b;
  }
   int add() {
    return a + b;
  }
  int subtract() {
    return a - b;
  }
  int lcm() {
    return (a * b) / getGCD();
  }
  private int getGCD() {
    int x = a;
    int y = b;
    while (x != 0 && y != 0) {
      if (x > y) {
        x = x % y;
      } else {
        y = y % x;
      }
    }
    return x == 0 ? y : x;
  }
}
public class Example2 {
  public static void main(String[] args) {
    MyMath m1 = new MyMath(12, 18);
    System.out.println(m1.add());
    System.out.println(m1.subtract());
    System.out.println(m1.lcm());
    
  }
}

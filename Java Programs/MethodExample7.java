import java.util.Scanner;

public class MethodExample7 {
  static boolean isPrime(int n) {
    int factorCount = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0)  factorCount++;
    }
    if (factorCount == 2) return true;
    else return false;
  }
  public static void main(String[] args) {
    int n = 19;
    System.out.println(isPrime(n));
  }
}

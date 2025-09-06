import java.util.Scanner;
public class FactorSumUsingWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int factorSum = 0;
    int i = 1;
    while (i <= number) {
      if (number % i == 0) {
        factorSum += i;
      }
      i++;
    }
    System.out.println(factorSum);
  }
}

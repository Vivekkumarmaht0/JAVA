import java.util.Scanner;

public class ArrayExample4 {
  public static void main(String[] args) {
    // minimum, maximum, sum of integer array
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr =  new int[n];
    for (int i = 0; i <  n; i++) {
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    int minValue = arr[0];
    int maxValue = arr[0];
    for (int i = 0; i < n; i++) {
      sum = sum + arr[i];
      // Checkinng if current element is smaller  than minimum
      if (arr[i]  < minValue) minValue = arr[i];
      // minValue = Math.min(minValue, arr[i]);
      // Checking  if current element is greater than maximum
      if (arr[i] > maxValue) maxValue = arr[i];
    }
    System.out.println("Sum is: " + sum);
    System.out.println("Minimum is: " + minValue);
    System.out.println("Maximum is: " + maxValue);
  }
}

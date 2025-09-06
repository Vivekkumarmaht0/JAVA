import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int m = read.nextInt();
        int n = read.nextInt();
        int sum1 = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int x = read.nextInt();
                if (x % 2 == 0) {
                    sum1 += x;
                }
            }
        }
        int p = read.nextInt();
        int q = read.nextInt();
        int sum2 =0;
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                int y = read.nextInt();
                if (y % 2 != 0) {
                    sum2 += y;
                }
            }
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}
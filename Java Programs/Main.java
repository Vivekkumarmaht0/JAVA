import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int cp = read.nextInt();
        int sp = read.nextInt();
        if (cp > sp) {
            System.out.println(cp - sp);
            System.out.println("Loss");
        } else if (sp > cp) {
            System.out.println(sp - cp) ;
            System.out.println("Profit");
        } else {
            System.out.println(cp - sp);
            System.out.println("NPNL");
        }
    }
}
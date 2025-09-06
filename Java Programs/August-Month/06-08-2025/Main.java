import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Reading the string
        String s = read.next();

        // Using sum to store the ASCII sum
        int sum = 0;

        /* Running the loop from 0 to only to lastindex - 1, 
           as lastindex will not have 
           any adjacent value to it's right
        */
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        // Print the result
        System.out.println(sum);
    }
}
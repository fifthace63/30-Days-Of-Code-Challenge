import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        /* These are using something called bitwise AND to determine if a number is odd; it's              essentially checking that the last bit in  is  (which would make the number odd). */
        System.out.println( ((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
        scanner.close();
    }
}

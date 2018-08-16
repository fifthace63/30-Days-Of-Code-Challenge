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
        int remind = 0;
        int counter = 0;
        int sequence = 0;
        
        while(n > 0)
        {
            remind = n%2;
            n = n/2;
            if (remind == 1)
            {
                counter++;
                if(counter > sequence)
                    sequence = counter;
            }
            else{
                counter = 0;
            }  
        }
        System.out.println(sequence);

        scanner.close();
    }
}


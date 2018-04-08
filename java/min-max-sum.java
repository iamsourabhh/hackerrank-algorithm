import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(long[] arr) {
        /*
         * Write your code here.
         */
        long minElement = 999999999999,maxElement = 0, sum = 0;
        for (long element: arr) {
            if(minElement > element) {
                minElement = element;
            }
            if(element > maxElement) {
                maxElement = element;
            }
            
            sum += element;
        }
        
        System.out.print((sum-maxElement) + " " + (sum-minElement));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (long arrItr = 0; arrItr < 5; arrItr++) {
            long arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
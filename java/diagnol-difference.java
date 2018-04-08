/**
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
Complete the diagonalDifference function which takes a 2D integer array as a parameter
and return an integer denoting the absolute difference between the diagonal sums.
 */

 import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the diagonalDifference function below.
     */
    static void diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */
         System.out.print(a.length);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        // int result = diagonalDifference(a);
        diagonalDifference(a);
        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}

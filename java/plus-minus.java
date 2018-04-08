/**
Given an array of integers, calculate the fractions of its elements that are positive, negative,
and are zeros. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal
places, though answers with absolute error of up to 10^-4 are acceptable.

 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
        float sumZero = 0 , sumPositive = 0, sumNegative = 0;
        for(int a: arr) {
            if(a == 0) {
                sumZero++;
            } else if(a > 0) {
                sumPositive++;
            } else {
                sumNegative++;
            }
        }
        int arrayLength = arr.length;
        System.out.println(sumPositive/arrayLength);
        System.out.println(sumNegative/arrayLength);
        System.out.println(sumZero/arrayLength);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}

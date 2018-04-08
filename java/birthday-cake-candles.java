/**
 * Problem Statement
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Write your code here.
         */
        int tallestCandle = 0;
        for(int candle: ar) {
            if(candle > tallestCandle) {
                tallestCandle = candle;
            }
        }
        
        int totalCandlesSheCanBlow = 0;
        for(int candle: ar) {
            if(candle == tallestCandle) {
                totalCandlesSheCanBlow++;
            }
        }
        
        return totalCandlesSheCanBlow;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}

/**
 * Problem Statement
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[]  splittedTime = s.split(":");
        String lastPart = splittedTime[splittedTime.length-1];
        String amOrPm = lastPart.substring(2,4);
        
        int hh = Integer.parseInt(splittedTime[0]);
        
        if(amOrPm.equals("PM") == true) {
            hh += 12;
                        if(hh == 24) {
                hh = 12;
            }

        } else if(amOrPm.equals("AM") == true) {
            if(hh == 12) {
                hh = 0;
            }
        }

        String time = String.format("%02d", hh) + ':' + splittedTime[1] + ':' + lastPart.substring(0,2);
        return time;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

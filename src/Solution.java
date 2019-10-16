import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int t = s.nextInt();
        int[] banks = new int[n+1];
        boolean[] going = new boolean[m];
        banks[0] = -1;
        for(int i = 1; i <= n; i ++) {
            banks[i] = s.nextInt(); //if banks[] = 0, robbed
        }
        for(int i = 0; i < m; i ++) {
            int startRobbingPosition = 0;
            int moneyHeRobbed = 0;

            for(int j = 2; j <= n; j ++) {
                if(banks[j] != 0) {
                    startRobbingPosition = j;
                    break;
                }
            }

            for(int j = 1; j*startRobbingPosition <= n; j++) {
                if(banks[j*startRobbingPosition] != 0) {
                    moneyHeRobbed += banks[j*startRobbingPosition];
                    banks[j*startRobbingPosition] = 0;
                }
            }
            if(moneyHeRobbed >= t)
                going[i] = true;
        }
        int noOfGoing = 0;
        for(boolean x : going)
            if(x)
                noOfGoing++;
        System.out.println(noOfGoing);
    }
}
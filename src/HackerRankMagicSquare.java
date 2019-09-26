import java.io.*;
import java.util.*;

public class HackerRankMagicSquare {

    // Complete the formingMagicSquare function below.
    private static int formingMagicSquare(int[][] s) {
        int[][][] possible3x3Squares = {{{8,1,6}, {3,5,7}, {4,9,2}},
                {{6,1,8}, {7,5,3}, {2,9,4}},
                {{4,9,2}, {3,5,7}, {8,1,6}},
                {{2,9,4}, {7,5,3}, {6,1,8}},
                {{8,3,4}, {1,5,9}, {6,7,2}},
                {{4,3,8}, {9,5,1}, {2,7,6}},
                {{6,7,2}, {1,5,9}, {8,3,4}},
                {{2,7,6}, {9,5,1}, {4,3,8}}};

        int min = 100;
        for (int[][] testCase : possible3x3Squares) {
            int diff = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    diff += Math.abs(testCase[j][k] - s[j][k]);
                }
            }
            if (diff < min) min = diff;
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                m[x][y] = s.nextInt();
            }
        }
        System.out.println(formingMagicSquare(m));
    }
}

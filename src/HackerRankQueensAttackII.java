import java.util.Scanner;

public class HackerRankQueensAttackII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt();
        int[] queen = new int[2];
        queen[0] = s.nextInt();
        queen[1] = s.nextInt();
        int[] right = new int[2]; //+ve x
        int[] rightB = new int[2]; //4th quadrant
        int[] bottom = new int[2]; //-ve y
        int[] bottomL = new int[2]; //3rd quadrant
        int[] left = new int[2]; //-ve x
        int[] leftT = new int[2]; //2nd quad
        int[] top = new int[2]; //+ve y
        int[] topR = new int[2]; //1st quadrant

        for (int i = 0; i < k; i++) {
            int[] obstacle = new int[2];
            obstacle[0] = s.nextInt();
            obstacle[1] = s.nextInt();

            //Right
            if(obstacle[0] == queen[0] && obstacle[1] > queen[1] && (obstacle[1] < right[1] || right[1]==0)) {
                right[0] = obstacle[0];
                right[1] = obstacle[1];
            }

            //Right Bottom
            else if(queen[0] - obstacle[0] == obstacle[1] - queen[1] && obstacle[1] - queen[1] > 0 && (obstacle[1] < rightB[1] || rightB[1]==0)) {
                rightB[0] = obstacle[0];
                rightB[1] = obstacle[1];
            }

            //Bottom
            else if(obstacle[1] == queen[1] && obstacle[0] < queen[0] && (obstacle[0] > bottom[0] || bottom[0]==0)) {
                bottom[0] = obstacle[0];
                bottom[1] = obstacle[1];
            }

            //Bottom Left
            else if (queen[0] - obstacle[0] == queen[1] - obstacle[1] && queen[1] - obstacle[1] > 0 && (obstacle[1] > bottomL[1] || bottomL[1] == 0)) {
                bottomL[0] = obstacle[0];
                bottomL[1] = obstacle[1];
            }

            //Left
            else if(obstacle[0] == queen[0] && obstacle[1] < queen[1] && (obstacle[1] > left[1] || left[1]==0)) {
                left[0] = obstacle[0];
                left[1] = obstacle[1];
            }

            //Left Top
            else if(queen[0] - obstacle[0] == obstacle[1] - queen[1] && obstacle[1] - queen[1] < 0 && (obstacle[1] > leftT[1] || leftT[1]==0)) {
                leftT[0] = obstacle[0];
                leftT[1] = obstacle[1];
            }

            //Top
            else if(obstacle[1] == queen[1] && obstacle[0] > queen[0] && (obstacle[0] < top[0] || top[0]==0)) {
                top[0] = obstacle[0];
                top[1] = obstacle[1];
            }

            //Top Right
            else if (queen[0] - obstacle[0] == queen[1] - obstacle[1] && queen[1] - obstacle[1] < 0 && (obstacle[1] < topR[1] || topR[1] == 0)) {
                topR[0] = obstacle[0];
                topR[1] = obstacle[1];
            }
        }

        int possibleMoves = 0;
        if(right[0] != 0) possibleMoves += right[1] - queen[1] - 1;
        else possibleMoves += n - queen[1];
        if(rightB[0] != 0) possibleMoves += rightB[1] - queen[1] - 1;
        else possibleMoves += (Math.min(n - queen[1], queen[0] - 1));
        if(bottom[0] != 0) possibleMoves += queen[0] - bottom[0] - 1;
        else possibleMoves += queen[0] - 1;
        if(bottomL[0] != 0) possibleMoves += queen[1] - bottomL[1] - 1;
        else possibleMoves += Math.min(queen[1], queen[0]) - 1;
        if(left[0] != 0) possibleMoves += queen[1] - left[1] - 1;
        else possibleMoves += queen[1] - 1;
        if(leftT[0] != 0) possibleMoves += queen[1] - leftT[1] - 1;
        else possibleMoves += Math.min(queen[1] - 1, n - queen[0]);
        if(top[0] != 0) possibleMoves += top[0] - queen[0] - 1;
        else possibleMoves += n - queen[0];
        if(topR[0] != 0) possibleMoves += topR[1] - queen[1] - 1;
        else possibleMoves += n - Math.max(queen[1], queen[0]);

        System.out.println(possibleMoves);
    }
}

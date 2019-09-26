import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HRClimbingTheLeaderboard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        String[] scoresString = reader.readLine().trim().split(" ");
        reader.readLine();
        String[] aliceString = reader.readLine().trim().split(" ");

        List<Integer> scores = new ArrayList<>();
        scores.add(Integer.parseInt(scoresString[0]));
        List<Integer> alice = new ArrayList<>();

        for (int i = 1; i < scoresString.length; i++)
            if (!scoresString[i].equals(scoresString[i - 1]))
                scores.add(Integer.parseInt(scoresString[i]));
        for (String i : aliceString) alice.add(Integer.parseInt(i));
        Collections.sort(scores);
        int[] result = new int[scores.size()];
        for (int i = 0; i < scores.size(); i ++) {
            result[i] = scores.get(i);
        }
        calculate(result, alice);
    }

    private static void calculate(int[] scores, List<Integer> alice) {
        for (int aliceScore : alice) {
            int score = 0;
            int rank = Arrays.binarySearch(scores, aliceScore);
//            System.out.println(rank);
            if(rank < 0)
                System.out.println(rank + scores.length + 2);
            else
                System.out.println(scores.length - rank);
        }
//        for (int aliceScore : alice) {
//            int score = 0;
//            for (int i = scores.size() - 1; i >= 0; i--) {
//                if (aliceScore < scores.get(i)) {
//                    score = i + 2;
//                    break;
//                } else if (aliceScore == scores.get(i)) {
//                    score = i+1;
//                    break;
//                } else {
//                    score = 1;
//                }
//            }
//            System.out.println(score);
//        }
    }
}

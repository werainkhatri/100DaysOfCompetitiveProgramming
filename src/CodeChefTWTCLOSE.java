import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;

public class CodeChefTWTCLOSE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        boolean[] tweets = new boolean[n];
        while (m-->0) {
            String[] test = reader.readLine().split(" ");
            if(test[0].equals("CLICK")) tweets[Integer.parseInt(test[1])-1] = !tweets[Integer.parseInt(test[1])-1];
            else if(test[0].equals("CLOSEALL"))
                Arrays.fill(tweets, false);
            int sum = 0;
            for (boolean tweet : tweets) sum += tweet ? 1 : 0;
            System.out.println(sum);
        }
    }
}

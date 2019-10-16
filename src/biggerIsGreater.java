import java.io.*;
import java.util.*;

public class biggerIsGreater {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        int len = w.length(), count = len, start = 0;
        String answer = "no answer";
        for(int i = len-1; i>start; i --) {
            char x = w.charAt(i);
            for(int j = i-1; j >=start; j --) {
                char y = w.charAt(j);
                if(y<x && count > i-j) {
                    count = i-j;
                    char[] tochar = (w.substring(j+1, i) + y + w.substring(i+1)).toCharArray();
                    Arrays.sort(tochar);
                    String dubugAnswer = w.substring(0, j) + x + new String(tochar);
                    if(!answer.equals("no answer")) {
                        if(answer.compareTo(dubugAnswer) > 0)
                            answer = dubugAnswer;
                    }
                    else {
                        answer = dubugAnswer;
                        start = j;
                    }
                    System.out.println(answer);
                }
            }
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

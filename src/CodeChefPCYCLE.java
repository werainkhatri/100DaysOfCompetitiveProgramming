import java.util.Scanner;

public class CodeChefPCYCLE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] str = s.nextLine().split(" ");
        int[][] numbers = new int[2][n];
        StringBuilder output = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            numbers[1][i] = Integer.parseInt(str[i]);
            numbers[0][i] = 0; //0-untouched 1-touched&running 2-touched&finished
        }
        boolean loop = true;
        int present = 0;
        while(loop) {
            for (int i = 0; i < numbers[1].length; i ++) {
                if(numbers[0][i] == 0) {
                    present = numbers[1][i];
                    numbers[0][i] = 1;
                    output.append(i + 1).append(" ");
                    break;
                }
                if(i == numbers[1].length - 1) {
                    loop = false;
                    break;
                }
            }
            if(!loop) break;
            boolean loop2 = true;
            int next = 0;
            while (loop2) {
                next = numbers[1][present-1];
                output.append(present).append(" ");
                if(numbers[0][present-1] == 1) {
                    loop2 = false;
                } else {
                    numbers[0][present-1] = 1;
                    present = next;
                }
            }
            output.append("\n");
            count++;
            for (int i = 0; i < numbers[1].length; i ++) if (numbers[1][i] == 1) numbers[1][i] = 2;
        }
        System.out.println(count + "\n" + output);
    }
}

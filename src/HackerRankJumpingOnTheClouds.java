import java.util.Scanner;

public class HackerRankJumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] clouds = new int[n];
        for (int i = 0; i < n; i++) clouds[i] = s.nextInt();
        int jumps = 0, posi=0;
        while(posi<n-1) {
            if(posi<=n-3 && clouds[posi+2] == 0) posi += 2;
            else posi++;
            jumps++;
        }
        System.out.println(jumps);
    }
}

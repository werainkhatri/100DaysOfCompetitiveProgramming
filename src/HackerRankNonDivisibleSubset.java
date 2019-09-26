import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HackerRankNonDivisibleSubset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt(), result = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < n; i ++) {
            nums.add(s.nextInt() % k);
            if(nums.get(i)==0) result++;
        }
        Collections.sort(nums);
        if(result>0) result = 1;
        for (int i = 1; i <= k/2; i ++) {
            int one=0, two=0;
            for (int j = 0; j < n; j++) {
                if((nums.get(j) == k/2 || nums.get(n-1-j) == k/2) && k%2==0 && i == k/2) {
                    result++;
                    break;
                }
                if(nums.get(j) == i) one++;
                if(nums.get(n-j-1) == k-i) two++;
            }
            result += Math.max(one, two);
        }
        System.out.println(result);
    }
}

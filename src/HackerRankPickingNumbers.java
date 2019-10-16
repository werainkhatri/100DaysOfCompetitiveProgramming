import java.io.*;
import java.util.*;

class HackerRankPickingNumbers {

    private static int pickingNumbers(List<Integer> a) {
        int max = 2, start = a.get(0);
        List<List<Integer>> numbers = new ArrayList<>();
        List<Integer> test = new ArrayList<>();
        for (int i = 0; i < a.size(); i ++) {
            if(a.get(i) == start || a.get(i)-start == 1) {
                test.add(a.get(i));
            } else {
                numbers.add(test);
                start = a.get(i);
                i--;
                test = new ArrayList<>();
            }
        }
        numbers.add(test);
        for (List<Integer> list : numbers) {
            if (list.size() > max)
                max = list.size();
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] nums = s.nextLine().trim().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String sa : nums) {
            numbers.add(Integer.parseInt(sa));
        }
        Collections.sort(numbers);
        System.out.println(pickingNumbers(numbers));
    }
}

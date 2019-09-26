import java.util.Scanner;

public class CodeChefCOINS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(calculateMax(scanner.nextLong()) + "");
        }
    }

    private static long calculateMax(long n)
    {
        if(n<=11)
            return n;
        long sum = 0, temp;
        long a1,a2,a3;
        a1 = calculateMax(n/2);
        a2 = calculateMax(n/3);
        a3 = calculateMax(n/4);
        sum = a1+a2+a3;
        temp = Math.max(n, sum);
        return temp;
    }
}
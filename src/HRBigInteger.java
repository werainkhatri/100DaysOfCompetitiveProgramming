import java.math.BigInteger;
import java.util.Scanner;

public class HRBigInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        s.nextLine();
        BigInteger number = new BigInteger("1");
        for (long i = n; i > 1; i--) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        System.out.println(number);
    }
}

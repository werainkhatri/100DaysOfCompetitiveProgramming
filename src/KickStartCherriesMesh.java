//import java.util.Scanner;
//
//public class KickStartCherriesMesh {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < t; i++) {
//            int n = scanner.nextInt(), m = scanner.nextInt();
//            scanner.nextLine();
//            scanner.nextLine();
//            System.out.println((n-1-m)*2 + m);
////            for (int j = 0; j < m + 1; j++) {
////                scanner.nextInt();
////            }
//        }
//    }
//}
import java.util.Scanner;

public class KickStartCherriesMesh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), m = scanner.nextInt();
            scanner.nextLine();
            scanner.nextLine();
            System.out.println((n-1-m)*2 + m);
        }
    }
}

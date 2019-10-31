import java.util.Scanner;

public class HRAppendAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine().trim();
        String string2 = sc.nextLine().trim();
        int num = sc.nextInt();
        if(string1.length() < string2.length()){
            String x = string1;
            string1 = string2;
            string2 = x;
        }
        System.out.println(appendAndDelete(string1, string2, num));
    }

    private static String appendAndDelete(String s1, String s2, int a) {
        if(s1.equals(s2)) {
            return a==0 ? "Yes" : (s1.length()*2 <= a) ? "Yes" : "No";
        }
        else if(s1.length() - s2.length() > a)
            return "No";
        String str1="", str2=""; int x=0;
        for (int i = 0; i < s2.length(); i++) {
            str1 = str1.concat(String.valueOf(s1.charAt(i)));
            str2 = str2.concat(String.valueOf(s2.charAt(i)));
            if((!str1.equals(str2))) {
                x = i;
                break;
            } else if ((s1.length() > s2.length() && i == s2.length()-1)) {
                x = ++i;
                break;
            }
        }
        if(x==0) return "No";
        else {
            return s1.substring(x).length() + s2.substring(x).length() == a ? "Yes" : "No";
        }
    }
}

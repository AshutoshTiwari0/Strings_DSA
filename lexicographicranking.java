package Strings;
import java.util.*;
public class lexicographicranking {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner ob = new Scanner(System.in);
        String s = ob.next();
        //optimised
        final int CHAR = 256;
        int res = 1;
        int n = s.length();
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul = mul * i;
        }
        int count[] = new int[256];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 1; i < CHAR; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < n - 1; i++) {
            mul = mul / (n - i);

            res = res + count[s.charAt(i) - 1] * mul;
            for (int j = s.charAt(i); j < CHAR; j++)
                count[j]--;
        }
        System.out.println(res);

    }
}

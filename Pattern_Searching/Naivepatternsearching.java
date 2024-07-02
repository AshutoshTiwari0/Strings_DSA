package Strings.Pattern_Searching;
import java.sql.SQLOutput;
import java.util.*;
public class Naivepatternsearching {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter text");
        String text=ob.next();
        System.out.println("enter pattern");
        String pattern=ob.next();
        /*
        String= ABABABCD
        Pattern= ABAB
        output-> 0,2

        String=> ABCABCD
        Pattern= ABCD
        output-> 3

        String-> AAAAA
        Pattern= AAA
        output-> 0,1,2
         */
        /*
        int m=pattern.length();
        int n=text.length();
        for(int i=0;i<=n-m;i++)
        {
            int j;
            for(j=0;j<m;j++) {
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    break;
                }
            }
            if(j==m)
            {
                System.out.println(i);
            }
        }
        */
/*
        int pointer1=0,pointer2=0;
        int l1=text.length(),l2=pattern.length();
        while(pointer1<l1 && pointer2<l2) {
            if (text.charAt(pointer1) == pattern.charAt(pointer2)) {
                pointer1++;
                pointer2++;
                if (pointer2 == l2) {
                    // Pattern found, print the starting index
                    System.out.println(pointer1 - pointer2);
                    // Reset pointer2 to start searching for the next occurrence
                    pointer2 = 0;
                }
            } else {
                // If there's a mismatch, move the pointer1 back to the next character after the start of the current match attempt
                pointer1 = pointer1 - pointer2 + 1;
                pointer2 = 0;
            }
        }
*/
        //improved naive algorithm. This works if the characters are distinct in pattern.
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<=n-m;)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(pattern.charAt(j)!=text.charAt(i+j))
                {
                    break;
                }
                if(j==m)
                {
                    System.out.println(i+" ");
                }
                if(j==0)
                {
                    i++;
                }
                else
                {
                    i=(i+j);
                }
            }
        }
    }
}


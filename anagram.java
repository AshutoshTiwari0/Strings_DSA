package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string 1");
        String s1=ob.next();
        System.out.println("enter string s2");
        String s2=ob.next();
        /*//naive
        //slight optimisation
        if(s1.length()!=s2.length())
        {
            System.out.println("false");
            return;
        }
        //sort these strings in aplhabetical order
        char a[]=s1.toCharArray();
        Arrays.sort(a);
        char b[]=s2.toCharArray();
        Arrays.sort(b);

        //check if these are equal. convert back to string

        String h=String.copyValueOf(a);
        String i=String.copyValueOf(b);
        //check if h and i are equal
        if(h.equals(i))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        */
         //optimised solution
        //if a character is present in s1 we inc count and if it is present in s2 we dec count. If strings are anagrams we will get the count as zero.
        if(s1.length()!=s2.length())
        {
            System.out.println("false");
            return;
        }
        int count[]=new int[256];
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int j=0;j<256;j++)
        {
            if(count[j]!=0)
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}

package Strings;

import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter s1");
        String s1=ob.nextLine();
        System.out.println("enter s2");
        String s2=ob.nextLine();
        //check  if s2 is a subsequence of s1 or not.
        /*
        All subsequences of ABC are
       "",A,B,C,AB,AC,BC,ABC.
         */
        //two pointer approach
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if(j==s2.length())
        {
            System.out.println("true");

        }
        else
        {
            System.out.println("false");
        }

    }
}

package Strings;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        String a=ob.next();
        //task to check if string is pallindrome
        //naive method
      /*  String a1="",a2="";
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            a1=a1+c;
            a2=c+a2;
        }
        if(a1.equals(a2)==true)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("not pallindrome");
        }*/
        //optimised method
        int l=0,r=a.length()-1;
        while(l<r)
        {
            if(a.charAt(l)==a.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                System.out.println("no");
                return;
            }
        }
        System.out.println("true");
    }
}

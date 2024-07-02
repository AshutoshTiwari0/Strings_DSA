package Strings;
import java.sql.SQLOutput;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        /* char str='A';
        System.out.println((int)str);
        */
        //print frequency of each character in sorted character
        /*System.out.println("enter string");
        Scanner ob=new Scanner(System.in);
        String s=ob.next();

        int count[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            System.out.println((char)(i+'a')+" "+count[i]);
        }
        /*
        there are different ways of creating a string in java

        */
        //method 1
        String one = "Hello";
        System.out.println("First method " + one);
        //method 2
        char a[] = {'a', 'b', 'c'};
        //----------MUTABLE STRINGS------------
        //method 3
        StringBuilder sb = new StringBuilder("Ashutosh");
        System.out.println(sb);
        //method 4
        StringBuffer sb2 = new StringBuffer("Ashutosh");
        System.out.println(sb2);
        //methods of string class
        String d = "ASHUTOSH";
        System.out.println(d.length());
        System.out.println(d.charAt(4));
        System.out.println(d.substring(4));
        System.out.println(d.substring(4, 7));

        //contains()
        String h = "ASHUTOSH";
        String j = "SHU";
        if (h.contains(j) == true) {
            System.out.println("contains string");
        } else {
            System.out.println("does not contain");
        }
        //equals
        String v = "ASHUTOSH";
        String u = "ASHUTOSH";
        if (v.equals(u)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        /*compareTo()
        Returns 0 if both strings are equal
        Returns -ve value if first string is smaller
        Returns +ve value if first string is greater
         */
        String Y = "HELLO";
        String X = "FERRARI";
        if (X.compareTo(Y) == 0) {
            System.out.println("String are equal");
        } else if (X.compareTo(Y) > 0) {
            System.out.println(X + " is greater than " + Y);
        } else {
            System.out.println(X + " is smaller than " + Y);
        }

        //comapre to compares alphabetically. Jiska alphabet pahle aata hoga voh chota
    /*
    Example-> ASHUTOSH-> A SAME S AAYA
    ABCDEFGH -> A SAME B AAYA
    NOW S AUR B COMPARED S IS BIGGER THAN B SO ASHUTOSH> ABCDEFGH.
     */
        //indexof
        String p = "GEEKSFORGEEKS";
        String b = "FOR";
        System.out.println(p.indexOf(b)); //output is 5.
    }
}

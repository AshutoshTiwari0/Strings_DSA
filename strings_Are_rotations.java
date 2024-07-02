package Strings;
import java.util.*;
public class strings_Are_rotations {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string 1");

        String s1=ob.next();
        System.out.println("enter string 2");
        String s2=ob.next();

        //task is to find if strings are rotations or not
       /* input-> s1="ABCD" s2="CDAB" -> YES (ABCD->BCDA->CDAB)
        input-> s1="ABAB"  s2="ABBA"-> NO */
        //Logic concat s1 with itself. if s1 contains s2 return true else false
        if(s1.length()!=s2.length())
        {
            System.out.println("false");
            return;
        }
        s1=s1+s1;
        System.out.println(s1.contains(s2));

    }
}

package Strings;

import java.util.*;

public class leftmostnonrepeating {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter a string");
        String str = ob.next();
        //naive
        /*
        for(int i=0;i<a.length();i++)
        {
            boolean flag=false;
            for(int j=0;j<a.length();j++)
            {
                if(i!=j && a.charAt(i)==a.charAt(j))
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
*/
        //optimised 1
        /*
        int count[]=new int[256];
        for(int i=0;i<a.length();i++)
        {
            count[a.charAt(i)]++;
        }
        for(int i=0;i<a.length();i++)
        {
            if(count[a.charAt(i)]==1)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        */
        //optimised 2 (only one traversal of string)
        int[] fI = new int[256];
        Arrays.fill(fI, -1);

        for (int i = 0; i < str.length(); i++) {
            if (fI[str.charAt(i)] == -1)
                fI[str.charAt(i)] = i;
            else
                fI[str.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (fI[i] >= 0) res = Math.min(res, fI[i]);
        }
        System.out.println((res == Integer.MAX_VALUE) ? -1 : res);
    }
}


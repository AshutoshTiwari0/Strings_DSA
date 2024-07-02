package Strings;
import java.util.*;
public class leftmostrepeating {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a string");
        String a=ob.next();
        /*
        problem statement-> return the first character from left which is repeating
        String a="geeksforgeeks" output->0 (index of g)
        String b="abbcc" output->1 index of b

         */
        //naive solution
        /*
        int l=a.length();
        int i,j;
        for( i=0;i<l;i++) {
            for ( j = i + 1; j < l; j++) {
                if (a.charAt(i) == a.charAt(j))
                    System.out.println(i);
                return;
            }
        }
        */

    //optimised solution 1
        /*
         final int CHAR=256;
        int count[]=new int[CHAR];
        for(int i=0;i<a.length();i++)
        {
            count[a.charAt(i)]++;

        }

        for(int i=0;i<a.length();i++)
        {
            if(count[a.charAt(i)]>1)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
*/
        //optimised 2
        boolean visited[]=new boolean[256];
        int res=-1;int i;
        for(i=a.length();i>0;i--)
        {
            if(visited[a.charAt(i)]==true)
            {
                res=i;
            }
            else {
                visited[a.charAt(i)]=true;
            }
        }
        System.out.println(res);
    }
}

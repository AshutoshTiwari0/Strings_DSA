package Strings;
import java.util.*;
/*//naive solution-> O(N^3)

class naive {
    boolean areDistinct(String a, int i,int j) {
        boolean visited[] = new boolean[256];
        for (int k = i; k <= j; k++) {
            if (visited[a.charAt(k)]==true) {
                return false;
            }
            visited[a.charAt(k)]=true;
        }
        return true;

    }

    int longestDistinct(String a) {
        int n=a.length(),res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(areDistinct(a,i,j))
                {
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}
*/
//better solution-> time: O(n2)
/*
class better
{
    int longestDistinct(String a)
    {
        int n=a.length(),res=0;
        for(int i=0;i<n;i++)
        {
            boolean visited[]=new boolean[256];
            for(int j=i;j<n;j++)
            {
                if(visited[a.charAt(j)])
                {
                    break;
                }
                else
                {
                    res=Math.max(res,j-i+1);
                    visited[a.charAt(j)]=true;
                }
            }
        }
        return res;
    }

}
*/
//best solution-> Time o(n)
class best
{
    int longestDistinct(String str)
    {
        int n = str.length();
        int res = 0;
        int prev[]=new int[256];
        Arrays.fill(prev,-1);
        int i=0;
        for (int j = 0; j < n; j++){
            i=Math.max(i,prev[str.charAt(j)]+1);
            int maxEnd=j-i+1;
            res=Math.max(res,maxEnd);
            prev[str.charAt(j)]=j;
        }
        return res;
    }
}

public class longest_substring_with_distinct_characters {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a string");
        String a=ob.next();
       // naive obj=new naive();
       // better obj=new better();
        best obj=new best();
        int ans=obj.longestDistinct(a);
        System.out.println(ans);

    }
}

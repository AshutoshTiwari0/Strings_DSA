package Strings;

import java.util.Scanner;


        /*
        task is to find if pattern is present in our text or any permutation of pattern is present in our text.
        EX-> Text="geeksforgeeks"
        pattern="frog"
        output-> true
        (forg is present in geeksforgeeks and frog is a permutation of frog)
         */
         //naive solution
/*
        class naive {
            boolean isPresent(String text, String pattern) {
                int n = text.length();
                int m = pattern.length();
                for(int i=0;i<=n-m;i++)
                {
                    if(areAnagram(pattern,text,i))
                    {
                        return true;
                    }
                }
                return false;
            }
            boolean areAnagram(String pattern, String text, int i)
            {
                int count[]=new int[256];
                for(int j=0;j<pattern.length();j++)
                {
                    count[pattern.charAt(j)]++;
                    count[text.charAt(i+j)]--;
                }
                for(int j=0;j<256;j++)
                {
                    if(count[i]!=0)
                    {
                        return false;
                    }
                }
                return true;
            }

        }
        */
//Optimised Solution
class optimised
        {
            boolean areSame(int CT[],int CP[]){
                for(int i=0;i<256;i++){
                    if(CT[i]!=CP[i])return false;
                }
                return true;
            }
            boolean isPresent(String txt, String pat)
            {
                int[] CT=new int[256];int[] CP=new int[256];
                for(int i=0;i<pat.length();i++){
                    CT[txt.charAt(i)]++;
                    CP[pat.charAt(i)]++;
                }
                for(int i=pat.length();i<txt.length();i++){
                    if(areSame(CT,CP))return true;
                    CT[txt.charAt(i)]++;
                    CT[txt.charAt(i-pat.length())]--;
                }
                return false;
            }


        }

public class anagram_search {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a string");
        String text=ob.next();
        System.out.println("enter a pattern");
        String pattern =ob.next();
        //naive obj=new naive();
        optimised obj=new optimised();
        boolean ans=obj.isPresent(text,pattern);
        System.out.println(ans);

    }
}

package Strings.Pattern_Searching;
//Bhai yaha ho kya rha. ye kaha aa gya bhai mai.
import java.util.*;
class solution
{
    static final int d=256;
    static final int q=101;
    static void RBSearch(String pat,String txt,int M, int N){

        //Compute (d^(M-1))%q
        int h=1;
        for(int i=1;i<=M-1;i++)
            h=(h*d)%q;

        //Compute p and to
        int p=0,t=0;
        for(int i=0;i<M;i++){
            p=(p*d+pat.charAt(i))%q;
            t=(t*d+txt.charAt(i))%q;
        }

        for(int i=0;i<=(N-M);i++){
            //Check for hit
            if(p==t){
                boolean flag=true;
                for(int j=0;j<M;j++)
                    if(txt.charAt(i+j)!=pat.charAt(j)){flag=false;break;}
                if(flag==true)System.out.print(i+" ");
            }
            //Compute ti+1 using ti
            if(i<N-M){
                t=((d*(t-txt.charAt(i)*h))+txt.charAt(i+M))%q;
                if(t<0)t=t+q;
            }
        }

    }
}

public class RabinKarp {
    public static void main(String[] args) {
        /*
        Working-> For matching our pattern we use a hash.
        If string matches with our hash or not.
        STEPS-> 1) SLIDE THE PATTERN ONE BY ONE.
                2) COMPARE HASH VALUES OF PATTERN OF CURRENT WINDOW. IF IT MATCHES, THEN ONLY COMPARE INDIVIDUAL CHARACTERS.
         */
        //P will be the hash value of pattern and T will be the hash value of current window of text
        /*
        we will assign some numbers to variables.
        Example-> A->1 B->2 C->3 D->4 .........
        IF PATTERN IS ABC-> SUM IS 1+2+3=6
        NOW IN EACH SUB STRING OF LENGTH 3 IF SUM IS EQUAL TO 3 THEN WE GOT THE PATTERN.

         */
        Scanner ob=new Scanner(System.in);
        System.out.println("enter text");
        String text=ob.next();
        System.out.println("enter pattern");
        String pattern=ob.next();
        int m=ob.nextInt();
        int n=ob.nextInt();
        solution obj=new solution();
        obj.RBSearch(pattern,text,m,n);
    }
}

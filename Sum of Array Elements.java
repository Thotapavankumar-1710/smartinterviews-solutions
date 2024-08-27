import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int n=q.nextInt();
        long sum=0;
        while(n!=0)
        {
            int t=q.nextInt();
            long a[]=new long[t];
            for(int i=0;i<t;i++)
            {
                a[i]=q.nextLong();
            }
            for(int i=0;i<t;i++)
            {
                sum=sum+a[i];
            }
            System.out.println(sum);
            n--;
            sum=0;
        }
    }
}
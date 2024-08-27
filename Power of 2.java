import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=q.nextLong();
            while(n%2==0)
            n=n/2;
            if(n==1)
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}
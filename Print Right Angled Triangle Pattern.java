import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        int n=0;
        for(int i=0;i<t;i++)
        {
            System.out.println("Case #"+(i+1)+":");
            n=q.nextInt();
        
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n-j-1;k++)
            {
                    System.out.print(" ");
            }
            for(int l=0;l<=j;l++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        }
    }
}
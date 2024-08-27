import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=q.nextInt();
            for(int j=0;j<1;j++)
            {
                String b=Integer.toBinaryString(n);
                System.out.println(b);
            }
        }
    }
}
import java.io.*;
import java.util.*;

public class Main {
        public static int[][] mm(int[][] mat1,int[][] mat2){
            int[][] res=new int[mat1.length][mat2[0].length];
            for(int i=0;i<mat1.length;i++){
                for(int j=0;j<mat2[0].length;j++){
                    int sum=0;
                    for(int k=0;k<mat2.length;k++)
                    {
                        sum+=mat1[i][k]*mat2[k][j];
                    }
                    res[i][j]=sum;
                }
            }
            return res;
        }
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        for(int i=0;i<t;i++)
        {
           // int a=q.nextInt();
            int n=q.nextInt();
            int m=q.nextInt();
            int mat1[][]=new int[n][m];
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<m;k++)
                {
                    mat1[j][k]=q.nextInt();
                }
            }
            int n1=q.nextInt();
            int m1=q.nextInt();
            int mat2[][]=new int[n1][m1];
            for(int j=0;j<n1;j++)
            {
                for(int k=0;k<m1;k++)
                {
                    mat2[j][k]=q.nextInt();
                }
            }
            int res[][] =mm(mat1,mat2);
            for(int[] r:res){
                for(int num:r){
                    System.out.print(num+" ");
                }
                System.out.println();
            }
            
        }
    }
}
/* checkerboard Pattern bookmark_borderYou are given an integer N. Print a 2N×2N checkerboard consisting of 2×2 squares alternating '*' and '-', with the top-left cell being '*'. See the following examples for N = 1,2,3 and 4 respectively.
  N = 1           N = 2                      N = 3
              N = 4
Input Format
The first line of input contains T - the number of test cases. It is followed by T lines, each line contains a single integer N - the size of the pattern.

Output Format
For each test case, print the test case number as shown, followed by the pattern, separated by a new line.

Constraints
1 <= T <=100
1 <= N <=100

Example
Input
2
4
2

OutputCase #1:
**--**--
**--**--
--**--**
--**--**
**--**--
**--**--
--**--**
--**--**
Case #2:
**--
**--
--**
--**



*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=q.nextInt();
            int c=2*n;
            System.out.println("Case #"+(i+1)+":");
            for(int j=0;j<c;j++)
            {
                 
                    for(int k=0;k<c;k++)
                    {
                       if(((j/2)+(k/2))%2==0)
                        System.out.print("*");
                        else
                        System.out.print("-");
                    }
                    System.out.println();
            }
        }
    }

}

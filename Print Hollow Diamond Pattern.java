/* Print Hollow Diamond Pattern 
Print a hollow diamond pattern using '*'. See examples for more details.



Input Format

The first line of input contains T - the number of test cases. It is followed by T lines, each line contains a single odd integer N - the size of the diamond.



Output Format

For each test case, print the test case number as shown, followed by the diamond pattern, separated by a new line.



Constraints

1 <= T <= 100

3 <= N <= 201



Example

Input

4
3
7
5
15


Output

Case #1:
 *
* *
 *
Case #2:
   *
  * *
 *   *
*     *
 *   *
  * *
   *
Case #3:
  *
 * *
*   *
 * *
  *
Case #4:
       *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
*             *
 *           *
  *         *
   *       *
    *     *
     *   *
      * *
       *


Explanation



Self Explanatory
*/



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Case #"+(i+1)+":");
            int n=q.nextInt();
            for(int j=0;j<n;j++)
            {
               int p,o;
               if(j<n/2+1)
               {
                   p=n/2+j;
                   o=n/2-j;
               }
               else
               {
                   p=j-n/2;
                   o=n-p-1;
               }
               for(int k=0;k<n;k++)
               {
                   if(k==p||k==o)
                    System.out.print("*");
                    else
                    System.out.print(" ");
               }
               System.out.println("");
            }
            System.out.println();
        }
    }
}
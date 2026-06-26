//GP is 1,4,16,32...n
package Loops;
import java.util.Scanner;
public class displayGP {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter a number:");
         int n = sc.nextInt();
         int a = 1; 
         int r = 2;
         for(int i=1;i<=n;i++)
         {
            System.out.print(a+" ");
            a*=r;
         }
         sc.close();
          
    }
    
}

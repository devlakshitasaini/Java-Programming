//The AP is 2,5,8,11...n
package Loops;
import java.util.Scanner;
public class printAP { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        for(int i=2;i<=3*n-1;i=i+3)
        {
            System.out.println(i);
        }
        sc.close();

    }
    
}

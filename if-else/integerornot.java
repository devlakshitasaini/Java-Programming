import java.util.Scanner;
public class integerornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter point x:");
        int n = sc.nextInt();
        int x = (int)n; 
        if(n-x==0)
            System.out.print("is an integer");
        else
            System.out.print("not an integer"); 
        sc.close();


    }
    
}

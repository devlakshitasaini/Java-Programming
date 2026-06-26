import java.util.Scanner;
public class simpleintrest { 
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
       
         System.out.print("p :");
         int p = sc.nextInt();
         System.out.print("r :");  
         int r = sc.nextInt();
         System.out.print("t :");
         int t = sc.nextInt();
          double si = p*r*t/100.0;
          System.out.print("The simple interest is :"); 
          System.out.print(si);
          
          sc.close();

    

    }

    
}

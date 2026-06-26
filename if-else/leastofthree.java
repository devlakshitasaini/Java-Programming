import java.util.Scanner;
public class leastofthree {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number:");
    int a = sc.nextInt();
    System.out.print("enter a number:");
    int b = sc.nextInt();
    System.out.print("enter a number:");
    int c = sc.nextInt(); 
    if(a<=b){
        if(a<=c) 
        System.out.println(a);
    else
        System.out.println(c);
    }
    else if (b<=a) {
        if(b<=c)
            System.out.println(b);
        else
            System.out.println(c);
    }
   // else
    //    System.out.println(c); 
    sc.close();
    
}
}
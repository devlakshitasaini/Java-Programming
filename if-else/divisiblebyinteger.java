import java.util.Scanner;
public class divisiblebyinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive integer:");
        int i = sc.nextInt();
        if(i%3==0 && i%5==0 )
            System.out.print("divisible by both 3 and 5");
        else if(i%3==0)
            System.out.print("divisible by 3");
        else if(i%5==0)
            System.out.print("divisible by 5");
        else if(i%3!=0 && i%5!=0)
            System.out.print("is not divisible by 5 or 3");
        sc.close();

    }
    
}

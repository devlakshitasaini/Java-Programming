import java.util.Scanner;
public class digitnumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.print("enter a number:");
    int n = sc.nextInt();
    if(n>999 && n<10000)
        System.out.print("four digit number");
    else
        System.out.print("not a four digit number");
    sc.close();

    }  

    }


    


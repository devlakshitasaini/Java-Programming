import java.util.Scanner;
public class squareofanumber { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number : ");
        int n = sc.nextInt(); 
        int square = n*n;
        System.out.println("the square is : ");
        System.out.println(square);
        sc.close();
         
    }
    
}

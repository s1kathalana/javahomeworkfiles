import java.util.Scanner;

public class InterchangedValue {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value for a");
        int a = scanner.nextInt();
        System.out.println("enter value for b");
        int b = scanner.nextInt();
        System.out.println("Befor swapping value of a is :" +a+" b is :" +b);
        int c= a;
         a= b;
         b=c;
        System.out.println("After swapping value of a is :" +a+" b is :" +b);



    }
}

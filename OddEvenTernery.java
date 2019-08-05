
import java.util.Scanner;

public class OddEvenTernery {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int oddeven = scanner.nextInt();

        String Result = ((oddeven%2)>=1)? oddeven+"  is odd" : oddeven+"  is even";
                System.out.println(Result);


    }
}

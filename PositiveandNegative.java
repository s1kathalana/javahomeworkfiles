import java.util.Scanner;

public class PositiveandNegative {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int a = scanner.nextInt();
        if(a>0){
            System.out.println("entered no  "+a+" is positive");}
         else if(a<0) {
            System.out.println("entered no  "+a+" is negative");}
            else System.out.println("entered no  "+a+" is zero");


    }
}


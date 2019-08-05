import java.util.Scanner;

public class Multiplication {
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
            int a = scanner.nextInt();
        System.out.println("enter second number: ");
            int b = scanner.nextInt();
            int c = a*b;
        System.out.println("multiplication of  "+a+" and "+b+ " = "+ + c);

        }
    }


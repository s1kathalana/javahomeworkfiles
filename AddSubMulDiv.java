import java.util.Scanner;

public class AddSubMulDiv {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number");
        float a = scanner.nextFloat();
        System.out.println("enter 2nd number");
        float b = scanner.nextFloat();
        System.out.println("enter one of the symbol +,-,*,/)");
        char c = scanner.next().charAt(0);
        float p;
        if (c == '+') {
            p = a + b;
            System.out.println("a+b = " + p);
        } else if (c == '-') {
            p = a - b;
            System.out.println("a-b =" + p);
        } else if (c == '*') {
            p = a * b;
            System.out.println("a*b =" + p);
        } else if (c == '/') {
            p = a / b;
            System.out.println("a/b =" + p);
        } else ;

    }


}

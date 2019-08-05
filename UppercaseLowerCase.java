import java.util.Scanner;

public class UppercaseLowerCase {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any alphabet in upper case");
        char a= scanner.next().charAt(0);
        System.out.println(Character.toLowerCase(a));

    }
}

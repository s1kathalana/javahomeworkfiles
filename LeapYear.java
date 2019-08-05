import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("input any year like 1989");
        int year = scanner.nextInt();
        if(year%4==0){
            System.out.println("entered year is a leap year");
        }
        else{
            System.out.println("entered year is not a leap year ");
        }


    }
}

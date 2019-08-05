import java.util.Scanner;

public class VoterAge {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter voter's age");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("Age entered "+age+ " is elligible to vote ");}
        else System.out.println("Age entered "+age+ "is not elligble to vote");
        System.out.println("A person who is eligible to vote must be older than or equal to 18 years old ");
        }
}
import java.util.Scanner;

public class AlphabetCityName {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any alphabet between a to f");
        char ab = scanner.next().charAt(0);
        if(ab=='a'){
        System.out.println("Ahmedabad");}
        else if(ab=='b'){
            System.out.println("Bombay");}
        else if(ab=='c'){
            System.out.println("Calcutta");}
            else if (ab=='d'){
                System.out.println("Delhi");}
                else if(ab=='e'){
                    System.out.println("economy");}
                else if(ab=='f'){
                    System.out.println("faridabad");}

                else System.out.println("invalid entry");



    }
}

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any alphabet");
        char a = scanner.next().charAt(0);
        if(a=='a'){
            System.out.println("entered character  "+a+ " is a vowel");}
         else if(a=='e'){
                System.out.println("entered character  "+a+" is a vowel");}
        else if(a=='i'){
            System.out.println("entered character  " +a+ " is a vowel");}
            else if(a=='o'){
            System.out.println("entered character  " +a+ " is a vowel");}
            else if(a=='u'){
            System.out.println("entered character  " +a+ " is a vowel");}
            else System.out.println("entered character  " +a+ " is a consonant");

    }
}

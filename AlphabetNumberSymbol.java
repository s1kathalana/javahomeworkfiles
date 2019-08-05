import java.util.Scanner;

public class AlphabetNumberSymbol {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any value");
        char c = scanner.next().charAt(0);
        int ascii = (int)c;
if (((ascii>=65)&&(ascii<=90))||((ascii>=97)&&(ascii<=122)))
{ System.out.println("it is a alphabet");}
else if ((ascii>=48)&&(ascii<=57)){
    System.out.println("it is a number");}
    else System.out.println("it is a symbol");

        }
    }





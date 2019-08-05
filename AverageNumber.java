import java.util.Scanner;

public class AverageNumber {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter five numbers with space");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        float e = scanner.nextFloat();
        float average = (a+b+c+d+e)/5;
        System.out.println("average is %.2f " +average);

    }
}


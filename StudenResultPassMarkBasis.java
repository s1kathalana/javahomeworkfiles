import java.util.Scanner;

public class StudenResultPassMarkBasis {
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student name");
        String studentname = scanner.next();
        System.out.println("enter student roll no.");
        int rollno = scanner.nextInt();
        System.out.println("enter maths marks");
        int mathsmarks = scanner.nextInt();
        System.out.println("enter science marks");
        int sciencemarks = scanner.nextInt();
        System.out.println("enter english marks");
        int englishmarks = scanner.nextInt();
        float mathsmarkspercentage = (100* mathsmarks)/100;
        float sciencepercentage = (100*sciencemarks)/100;
        float englishpercentage = (100*englishmarks)/100;
        if((mathsmarkspercentage >=35)&& (sciencepercentage >=35)&&(englishpercentage >=35)){
            System.out.println("student is pass");}
        else System.out.println("student is fail");

    }
}

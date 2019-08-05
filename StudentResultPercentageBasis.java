import java.util.Scanner;

public class StudentResultPercentageBasis {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student name");
        String studentname = scanner.next();
        System.out.println("enter roll no");
        int rollno = scanner.nextInt();
        System.out.println("enter maths marks");
        int mathsmarks = scanner.nextInt();
        System.out.println("enter science marks");
        int sciencemarks = scanner.nextInt();
        System.out.println("enter english marks");
        int englishmarks = scanner.nextInt();
        int total = mathsmarks + sciencemarks + englishmarks;
        float percentage = (100*total)/300;
        System.out.println(percentage);

        if(percentage>=80){
            System.out.println("Result is Pass and Grade is A+");}
         else if(percentage>=60){
                System.out.println("Result is Pass and Grade is A");}
         else if(percentage>=50){
                    System.out.println("Result is pass and Grade is B");}
         else if(percentage>=35){
                System.out.println("Result is pass and Grade is C");}
                else
                    System.out.println("Result is fail and grade is F");

}
        }




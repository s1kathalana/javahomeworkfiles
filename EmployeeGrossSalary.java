import java.util.Scanner;

public class EmployeeGrossSalary {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter employee ID");
        int employeeid = scanner.nextInt();
        System.out.println("enter employee name");
        String employeename = scanner.next();
        System.out.println("enter basic salary");
        float basicsalary = scanner.nextFloat();
        float Hra = (basicsalary*10)/100;
        float Da= (basicsalary*8)/100;
        float Ta = (basicsalary*9)/100;
        float Pf = (basicsalary*20)/100;
        float Grosssalary = (basicsalary+Hra+Da+Ta)-Pf;
        System.out.println("Gross Salary is  "+Grosssalary);


    }
}

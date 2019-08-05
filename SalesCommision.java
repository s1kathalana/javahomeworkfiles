
import java.util.Scanner;

public class SalesCommision {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sales id");
        int salesid = scanner.nextInt();
        System.out.println("enter seller's name");
        String sellername = scanner.next();
        System.out.println("enter sales amount");
        float salesamount = scanner.nextFloat();
        System.out.println("enter salary basic");
        float salarybasic = scanner.nextFloat();
        float salescommision;
        if(salesamount>=50000){
           salescommision = (salarybasic*35)/100;
            System.out.println(salescommision);}

        else if(salesamount>=30000){
             salescommision = (salarybasic*20)/100;
            System.out.println(salescommision);}
        else if (salesamount>=20000){
             salescommision = (salarybasic*10)/100;
            System.out.println(salescommision);}
        else if (salesamount>=10000){
            salescommision = (salarybasic*5)/100;
            System.out.println((salescommision));}
        else
            salescommision = (salarybasic*2)/100;
            System.out.println(salescommision);





    }
}

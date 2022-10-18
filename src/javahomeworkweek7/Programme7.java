package javahomeworkweek7;
 /*Write a java program input sales id, seller's name, sales amount, and salary basic and
         then fined this sales*/

import java.util.Scanner;

public class Programme7 {
    static Scanner sc = new Scanner(System.in);
    static String sellersName;
    static int salesID, salesAmount, salaryBasic;
    static float commision;
    public static void main(String[] args){
        salesCommission();

    }
    public static void salesDetails(){
        System.out.print("Enter Sales id :");
        salesID=sc.nextInt();
        System.out.print("Enter Seller Name :");
        sellersName = sc.next();
        System.out.println("Enter Sales Amount");
        salesAmount=sc.nextInt();
        System.out.println("Enter Salary basic:");
        salaryBasic = sc.nextInt();
    }

    public static void salesCommission(){
        salesDetails();
        if(salesAmount>=50000){
            commision = (salesAmount * 35)/100f;
            System.out.println("Commission is:" +commision);
        } else if(salesAmount>=30000){
            commision = (salesAmount * 20)/100f;
            System.out.println("Commision is:" +commision);
        }else if(salesAmount>=20000) {
            commision = (salesAmount * 10) / 100f;
            System.out.println("Commission is: " + commision);
        }else if (salesAmount>=10000) {
            commision = (salesAmount * 5) / 100f;
            System.out.println("Commision is: " + commision);
        }else{
            commision = (salesAmount * 2)/100f;
            System.out.println("Commision is: "+commision);

        }

    }
}






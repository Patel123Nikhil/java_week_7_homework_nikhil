package javahomeworkweek7;
/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
        salary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PF
        Print in following format
        _______________________________
        | Salary Slip |
        |______________________________|
        | Employee Id : 2564 |
        | Employee Name : Jay |
        |______________________________|
        | Basic Salary : 25000.0 |
        | HRA 10% : 2500.0 |
        | TA 8% : 2250.0 |
        | DA 9% : 2000.0 |
        | PF - 20& : 5000.0 |
        |______________________________|
        | Gross Salary : 26750.0 |*/


import java.util.Scanner;

public class Programme5 {
    static int eid, bsal;
    static float hra,ta, da,pf,gsal;
    static String name;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        salarySlip();
    }

    public static void empDetails(){
        System.out.println("Enter EmpName:");
        name=sc.nextLine();
        System.out.print("Enter Empld :");
        eid = sc.nextInt();
    }

    public static void salaryCalc(){
        System.out.println("Enter Employee basic salary:");
        bsal = sc.nextInt();
        hra = (bsal*10)/ 100f;
        ta = (bsal*8)/100f;
        da = (bsal*9)/100f;
        pf = (bsal*20/100f);
        gsal = (bsal + hra + ta +da) - pf;
    }

    public static void salarySlip(){
        empDetails();
        salaryCalc();
        System.out.println("|---------------------------|");
        System.out.println("|        Salary             |");
        System.out.println("|---------------------------|");
        System.out.println("|Employee id : " +eid+"     |");
        System.out.println("|Employee Name:" +name+"    |");
        System.out.println("|---------------------------|");
        System.out.println("|Basic Salary: " + bsal + "   |");
        System.out.println("|HRA 10%  : " + hra +"      |");
        System.out.println("|TA 8%  :"+ta+"             |");
        System.out.println("|DA 9%  :" +da+"            |");
        System.out.println("|PF(-20%)  : "+pf+"         |");
        System.out.println("|---------------------------|");
        System.out.println("|Gross Salary: "+gsal+"     |");
        System.out.println("|---------------------------|");

    }
}
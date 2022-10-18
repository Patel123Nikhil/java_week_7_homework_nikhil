package javahomeworkweek7;


/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import java.util.Scanner;
public class Programme8 {


        static char city;

        public static void main(String[] args) {

            getCityName();

        }

        public static void cityinitialSelection() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Initial of city A to F || a to f to get city name:");
            city = sc.next().charAt(0);
        }

        public static void getCityName() {
            cityinitialSelection();
            if (city == 'A' || city == 'a') {
                System.out.println("Ahmedabad");
            }else if (city == 'B' || city == 'b'){
                System.out.println("Bombay");
            }else if(city =='C'|| city =='c'){
                System.out.println("Chandigath");
            }else if(city =='D'|| city == 'd'){
                System.out.println("Dahod");
            }else if(city == 'E' || city == 'e'){
                System.out.println("Edmonton");
            }else if(city == 'F' || city == 'f'){
                System.out.println("Faridabad");
            }else{
                System.out.println("Enter valid Initial of city");

            }

        }
    }






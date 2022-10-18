package javahomeworkweek7;
//Same as above program-8 using switch statement
import java.util.Scanner;

public class Programme9 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Initial of city A to F || a to f to get city name: ");
            char city = sc.next().charAt(0);
            getCityName(city);
        }

        public static void cityInitialSelection() {

        }

        public static void getCityName(char city) {
            cityInitialSelection();
            switch (city) {
                case 'A':
                    System.out.println("Amreli");
                    break;
                case 'a':
                    System.out.println("amreli");
                    break;
                case 'B':
                    System.out.println("Berlin");
                    break;
                case 'b':
                    System.out.println("berlin");
                    break;
                case 'C':
                    System.out.println("Captown");
                    break;
                case 'c':
                    System.out.println("captown");
                    break;
                case 'D':
                    System.out.println("Dublin");
                    break;
                case 'd':
                    System.out.println("dublin");
                    break;
                case 'E':
                    System.out.println("Edmount");
                    break;
                case 'e':
                    System.out.println("edmount");
                    break;
                case 'F':
                    System.out.println("Fiji");
                    break;
                case 'f':
                    System.out.println("fiji");
                    break;
                default:
                    System.out.println("Enter valid Initial of city");
            }
        }
    }




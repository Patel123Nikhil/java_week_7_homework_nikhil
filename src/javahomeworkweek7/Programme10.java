package javahomeworkweek7;
/*Write a java program to input any two number and ask user to enter their symbol (+, -,
        /, *) find addition, Subtraction, multiplication and division according to their symbol
        (using if else)*/

import java.util.Scanner;

    public class Programme10
    {
        public static void main(String args[]){

            int first, second, add, subtract, multiply;
            float devide;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Two Numbers : ");
            first = scanner.nextInt();
            second = scanner.nextInt();

            add = first + second;
            subtract = first - second;
            multiply = first * second;
            devide = (float) first / second;

            System.out.println("Sum = " + add);
            System.out.println("Difference = " + subtract);
            System.out.println("Multiplication = " + multiply);
            System.out.println("Division = " + devide);
        }
    }





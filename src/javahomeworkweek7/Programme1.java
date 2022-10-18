package javahomeworkweek7;
/*Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)*/


import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = reader.nextInt();
        String programme1 = (num % 2 == 0)? "even" : "odd";
        System.out.println(num +  "is" + programme1);
    }

}

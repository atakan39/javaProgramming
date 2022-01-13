package day11_Switch_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter an Integer :");
        int number = input.nextInt();



        System.out.println("Enter an decimal number :");
        double number2=input.nextDouble();

        System.out.println(number);
        System.out.println(number2);
        System.out.println("Multiplication: "+(number+number2));

        input.close(); // this close scanner you cant not use anymore.
    }
}
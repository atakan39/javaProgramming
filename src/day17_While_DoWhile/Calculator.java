package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1=inPut.nextInt();
        System.out.println("Enter your second number:");
        int num2=inPut.nextInt();
   // if you know how many times you nee to repeat   for loop best
        // if you dont know how many times it will repeat while loop is the best.
        System.out.println("Enter a math operator");
        char ch=inPut.next().charAt(0);

        while(!(ch=='+' || ch=='-')){
            System.err.println("invalid Operator, please re-enter");
            ch=inPut.next().charAt(0);

        }

        System.out.println(( ch=='+')? num1+num2 : num1-num2);

        inPut.close();

    }
}

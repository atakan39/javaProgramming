package day08_IfStatements;

import java.sql.SQLOutput;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 300;

        System.out.println("Odd Number"); //
        System.out.println("Even Number"); // diveded 2 is 0 spouse to be 0

        boolean evenNumber = number%2 == 0;
        // boolean oddNumber = ! evenNumber;   (second way )

        if (evenNumber){ // even number
            System.out.println(number+" is even number");

        }

        if (!evenNumber) { // not even number
            System.out.println(number + " is odd number");

            // or we can do if(oddNumber) but we sould creat boolean for it
            // example boolean oddNumber = ! even number above ^

            System.out.println("-----------------------------");

        }

            int  n = 200;   // we need to creat 3 conditions for 1 outputs = 3 if

            // positive
            if(n > 0) { // if n greater than zero,
                System.out.println(n + " is positive");
            }
                // negative
            if(n < 0) { // if the n lower than zero
                System.out.println(n + " is positive");
            }

            if(n == 0){
                System.out.println(n+" is zero");
            }




    }
}

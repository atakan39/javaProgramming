package day08_IfStatements;

import org.w3c.dom.ls.LSOutput;

public class EvenlyDivisible {

    public static void main(String[] args) {
        int number = 65;

        boolean divisibleby2 = 65 % 2 == 0; // if the remainder of a number divide by 2 is zero, then it 's evenly divided by zero
        boolean divisibleby3 = 65 % 3 == 0;
        boolean divisibleby4 = 65 % 5 == 0;

        System.out.println(number+ " is divisibleb by 2: "+ divisibleby2);
        System.out.println(number+ " is divisibleb by 3: "+ divisibleby3);
        System.out.println(number+ " is divisibleb by 4: "+ divisibleby4);

        System.out.println("_---------------------------------------");

        int year = 2000;
        boolean isLeapYear = year % 4 == 0 ;

        System.out.println(year + " is leap year: "+ isLeapYear );
    }
}
/*
2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */


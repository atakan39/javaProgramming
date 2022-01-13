package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str ="Java Programming Language";
        StringUtility.printEAchChar(str);

        str=StringUtility.reverse(str);

        System.out.println(str);

        boolean palindrome=str.equals(StringUtility.reverse(str));

        System.out.println(palindrome);

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);



    }

    }


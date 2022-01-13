package day25_CustomMethods_Overloading;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

    int sum=sumOfNumbers(5,6,4);
        System.out.println(sum);


    }
     // integers
    public static int sumOfNumbers(int n1, int n2){

        return n1+n2;
    }
    public static int sumOfNumbers(int n1, int n2, int n3){

        return n1+n2+n3;
    }
    public static int sumOfNumbers(int n1, int n2, int n3, int n4){

        return n1+n2+n3+n4;
    }
    //decimals
    public static double sumOfNumbers(double n1, double n2){

        return n1+n2;
    }
    public static double sumOfNumbers(double n1, double n2, double n3){

        return n1+n2+n3;
    }
    public static double sumOfNumbers(double n1, double n2, double n3, double n4){

        return n1+n2+n3+n4;
    }

}



/*
   creat a method that can find the sum of two numbers
 method name: sumOf2Numbers

   creat a method that can find the sum of three numbers
 method name: sumOf3Numbers

   creat a method that can find the sum of four numbers
 method name: sumOf4Numbers
 */
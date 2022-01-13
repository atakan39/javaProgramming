package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;
import utilities.MathUtility;
import utilities.StringUtility;

public class Test3 {
    public static void main(String[] args) {

        String names[]={"atakan","emre","emre","emre"};

        int result=ArraysUtility.frequencyOfElement(names,"emre");
        System.out.println(result);

        double []decimals={3.5,4.5,5.5};

        int result2=ArraysUtility.frequencyOfElement(decimals,4.5);

        System.out.println(result2);

      int n1=5;
      int n2=-10;

      double x1=6.5;
      double x2=3.5;

        System.out.println(" min numbers :\n"+MathUtility.min(n1, n2)+"\n"+MathUtility.min(x1,x2));

        System.out.println("max numbers :\n"+MathUtility.max(n1,n2)+"\n"+MathUtility.max(x1,x2));

        System.out.println(MathUtility.isEven(n1));   // false
        System.out.println(MathUtility.isOdd(n1));    // true

        System.out.println(MathUtility.isEven(n2));   // true
        System.out.println(MathUtility.isOdd(n2));    // false

        System.out.println(MathUtility.substract(n1,n2));  // -5
        System.out.println(MathUtility.substract(x1,x2));  // 3

        System.out.println(MathUtility.sum(n1,n2)+" "+MathUtility.sum(x1,x2));
        System.out.println(MathUtility.squareOf(n2));
        System.out.println(MathUtility.cubeOf(x2));

        System.out.println(MathUtility.division(x2,x1));

        System.out.println(MathUtility.multiplication(x1,x2));

        System.out.println(MathUtility.multiplication(n1,n2));

        String a="kemal";
        String b="beser";

        StringUtility.anagram(a,b);
        System.out.println(StringUtility.anagram(a,b));








    }
}

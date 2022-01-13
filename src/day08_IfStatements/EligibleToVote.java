package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "josh";
        int age = 38;
        String citizien = "USA";

        boolean isEligible = age >= 21 && citizien == "USA";  //true

        //eligible

        if (isEligible) { // true
            System.out.println("eligible");
        }
        // not eligible

        if (!isEligible) {// true ==>  not true==> false
            System.out.println("Not Eligible");


        }
    }
}

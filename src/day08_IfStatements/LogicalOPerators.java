package day08_IfStatements;

public class LogicalOPerators {
    public static void main(String[] args) {
        String name ="Aaron";
        int age = 14;
        String citizien = "USA";

        boolean isEligible = age >= 18 && citizien == "USA";
        //                    19 >= 18     "UK"" == "USA"
        //                      true        false ===> false

        System.out.println(name+ " is eligible to vote: "+ isEligible);

        System.out.println("----------------------------------------");

        String name2 = "Josh";

        int credirScore = 800,
                age2 = 42,
                income = 40000;
        boolean isEligible2 = credirScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println( name2 + " is eligible for loan: "+isEligible2);

        System.out.println("----------------------------------------");

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender== 'M' || gender == 'F');
        //                       21>=18 && ('F' == 'M'    ||  'F'   == 'F'
        //                       true          false           true
        //
        //

        System.out.println( name3 + " is eligible for something: "+isEligible3);

        System.out.println("----------------------------------------");

        String name4 = "James";

        String contryOfBirth = "USA";
        boolean marriedToUSCitizien = false;

        boolean isEligible4= contryOfBirth == "USA" || marriedToUSCitizien == true;

        System.out.println(name4 + " is eligible for apply citizenship: "+isEligible4);

        System.out.println("----------------------------------------");

        String student = "Anna";

                double gpa = 3.5;
                int familyIncome = 100000;

                boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for schoolarship: "+isEligible5);

        System.out.println("-------------------------------------------");


        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);












    }
}

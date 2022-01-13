package day08_IfStatements;

public class IsEligibleToBuy {
    public static void main(String[] args) {

        int age = 15;
        char sickness = 'N';

        String question = "Is this person can buy cigarettes? ";

        boolean isEligible = age >= 18 && sickness != 'Y';


        if (isEligible) {
            System.out.println(question+ "YES");
        }

        if (!isEligible) {
            System.out.println(question+ "NO");
        }

    }
}
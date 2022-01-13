package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {
        int score = 85; // 0 ~100

        boolean a = score >= 90 && score <= 100;   //false
        boolean b = score >= 80 && !a;             // true
        // boolean b = score >= 80 && score <= 89;
        boolean c = !a && !b && score >= 70;       // false
        // boolean c = score >= 70 && score <= 79;
        boolean d = !a && !b && !c && score >= 60;  // false
        // boolean c = score >= 60 && score <= 69;
        boolean f = !a && !b && !c && !d;          //false
        // boolean f = score >= 0 && score <= 59;

        if (a) { // if the student made an A
            System.out.println("Exellent");
        }

        else if (b) { // if the student made an B
            System.out.println("Great");
        }

        else if (c) { // if the student made an C
            System.out.println("Good");
        }

        else if (d) { // if the student made an D
            System.out.println("Passed");
        }

        else { // if the student made F
            System.out.println("Failed");
        }
    }
}



/*

   90 ~ 100 ==> Excellent
   80 ~ 89 ==> Great
   70 ~ 79 ==> Good
   60 ~ 69 ==> Passed
   ) ~ 59 ==>

 */

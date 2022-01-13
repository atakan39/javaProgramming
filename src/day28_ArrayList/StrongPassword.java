package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;   // uppercase
        boolean r3 = false;   // lovercase
        boolean r4 = false;   // digit
        boolean r5 = false;   // special chars

        char chars[] = password.toCharArray();

        for (char aChar : chars) {

            if (Character.isUpperCase(aChar)) {
                r2 = true;
            } else if (Character.isLowerCase(aChar)) {
                r3 = true;
            } else if (Character.isDigit(aChar)) {
                r4 = true;
            } else {
                r5 = true;
            }
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);
    }

    public static boolean isStrongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else { // special char
                r4 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;


    }
}
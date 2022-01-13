package day08_IfStatements;

public class NameOfTheMonth {

    public static void main(String[] args) {

        int date = 8; // 1~12

        boolean month01 = date == 1;
        boolean month02 = date == 2;
        boolean month03 = date == 3;
        boolean month04 = date == 4;
        boolean month05 = date == 5;
        boolean month06 = date == 6;
        boolean month07 = date == 7;
        boolean month08 = date == 8;
        boolean month09 = date == 9;
        boolean month10 = date == 10;
        boolean month11 = date == 11;
        boolean month12 = date == 12;

        String result = (month01)? "January" :(month02)? "February" :(month03)? "March" :(month04)? "april"
                :(month05)? "may" :(month06)? "June" :(month07)? "July" :(month08)? "Aug" :(month09)? "Sep" :(month10)? "Oct"
                :(month11)? "November" : "December";

        System.out.println(result);

        // i think we should use ++ but i just go for long way


        /*
        if (month01) {
            System.out.println("January");
        }
        if (month02) {
            System.out.println("February");
        }
        if (month03) {
            System.out.println("March");
        }
        if (month04) {
            System.out.println("April");
        }
        if (month05) {
            System.out.println("May");
        }
        if (month06) {
            System.out.println("June");
        }
        if (month07) {
            System.out.println("July");
        }
        if (month08) {
            System.out.println("August");
        }
        if (month09) {
            System.out.println("September");
        }
        if (month10) {
            System.out.println("October");
        }
        if (month11) {
            System.out.println("November");
        }
        if (month12) {
            System.out.println("December");
        }
        */


    }
}

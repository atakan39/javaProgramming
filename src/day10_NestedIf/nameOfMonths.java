package day10_NestedIf;

public class nameOfMonths {
    public static void main(String[] args) {
        int date = 12; // 1~12
                       // Pre conditoin Nested if )
        String result =(date>0 && date<=12)? (date == 1)? "January" :(date == 2)? "February" :(date == 3)? "March" :(date == 4)? "april"
                :(date == 5)? "may" :(date == 6)? "June" :(date == 7)? "July" :(date == 8)? "Aug" :(date == 9)? "Sep" :(date == 10)? "Oct"
                :(date == 11)? "November" : "December" : "Invalid";

        System.out.println(result);

        // mixed it to understand easy

        if (date>0 && date<=12) {
            String result2 = (date == 1) ? "January" : (date == 2) ? "February" : (date == 3) ? "March" : (date == 4) ? "april"
                    : (date == 5) ? "may" : (date == 6) ? "June" : (date == 7) ? "July" : (date == 8) ? "Aug" : (date == 9) ? "Sep" : (date == 10) ? "Oct"
                    : (date == 11) ? "November" : "December";
        }else{
           String result2 = "Invalid ";
        }
    }
}

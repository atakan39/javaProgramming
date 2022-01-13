package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int date = 8; // 1~12

        String result = (date == 1)? "January" :(date == 2)? "February" :(date == 3)? "March" :(date == 4)? "april"
                :(date == 5)? "may" :(date == 6)? "June" :(date == 7)? "July" :(date == 8)? "Aug" :(date == 9)? "Sep" :(date == 10)? "Oct"
                :(date == 11)? "November" : "December";

        System.out.println(result);
    }

}

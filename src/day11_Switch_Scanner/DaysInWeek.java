package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
         int number = 3; // you CANT do swich
        // long ,
        // float ,
        // double ,
        // boolean
         String result;

        switch (number) { //1,2,3,4,5,6,7 ==

            case 1:
                result="Monday";
                break; // exits the wicth after executing the case block
            case 2:
                result="Tuesday";
                break; // exits the wicth after executing the case block
            case 3:
                result="Wednesday";
                break; // exits the wicth after executing the case block
            case 4:
                result="Thursday";
                break; // exits the wicth after executing the case block
            case 5:
                result="Friday";
                break; // exits the wicth after executing the case block
            case 6:
                result="Saturday";
                break; // exits the wicth after executing the case block
            case 7:
                result="Sunday";
                break; // exits the wicth after executing the case block
            default: // you can place it anywhere only be one.
                result="invalid";
        }
        System.out.println(result);
    }
}

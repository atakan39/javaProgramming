package day08_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {
        int number = 3;

        String day;

        boolean day01 =number == 1;
        boolean day02 =number == 2;
        boolean day03 =number == 3;
        boolean day04 =number == 4;
        boolean day05 =number == 5;
        boolean day06 =number == 6;
        boolean day07 =number == 7;

        if(day01){
           // System.out.println("Today is Monday ");
            day = "monday";
        }
        else if(day02){
           // System.out.println("Today is Tuesday ");
            day = "tuesday";

        }
        else if(day03){
           // System.out.println("Today is Wednesday");
            day = "wednesday";

        }
        else if(day04){
           // System.out.println("Today is Thursday");
            day = "thursday";

        }
        else if(day05){
           // System.out.println("Today is Friday");
            day = "friday";

        }
        else if(day06){
           // System.out.println("Today is Saturday");
            day = "saturday";

        }
        else{
           // System.out.println("Today is Sunday");
            day = "sunday";
        }

        System.out.println("day = " + day);

        System.out.println("-------------------------------------");

    }
}

/*
2. write a program that can display the name of the day

            number = 1 ~ 7

 */
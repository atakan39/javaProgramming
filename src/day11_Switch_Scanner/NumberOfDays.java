package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year= 2004;
        int m =2;

        String result="";
        if(m>0&&m<=12){
            switch (m){
                case 2:
                   result = (year % 4 == 0)? "29 days":"28 Days";
                break;
                case 4: case 6: case 7: case 9:
                    result="30 Days";
                    break;
                default:
                    result="31 Days";
            }
        }else{
            result="invalid";
        }
        System.out.println(result);
    }
}

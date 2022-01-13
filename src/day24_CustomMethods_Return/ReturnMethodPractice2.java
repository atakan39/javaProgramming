package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        // creat a function that can calculate the grade
        String str1=grade(64);

       if(str1.equals("A")){
           System.out.println("Excellent");
       }else if(str1.equals("B")){
           System.out.println("Great");
       }else if(str1.equals("C")){
           System.out.println("Good");
       }else if(str1.equals("D")){
           System.out.println("Passed");
       }else{
           System.out.println("Try Again");
       }

        /*
        check the grade:
        'A' ====>Excellent
        'B' ====>Great
        ....
         */


    }

    public static String grade(int score){
        String result="";

        if(!(score>0 && score<=100) ){
            System.out.println("invalid");
        }else{
             result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }
        System.out.println(result);
        return result;
    }
}

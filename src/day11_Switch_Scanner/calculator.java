package day11_Switch_Scanner;

public class calculator {
    public static void main(String[] args) {
        int n1=5, n2=10;
        double result=0;
        char operator='*';
        boolean valid = operator == '+'|| operator == '-'|| operator=='*'||operator=='/';

        if(valid){
            switch (operator){
                case '+':
                    result=n1+n2;
                    break;
                case '-':
                    result=n1-n2;
                    break;
                case '*':
                    result=n1*n2;
                    break;
                default:
                    result=n1/n2;
            }
        }else{
            System.out.println("Invalid entry");
        }


        System.out.println(" "+n1+""+operator+""+n2+ " = " + result);



    }
}

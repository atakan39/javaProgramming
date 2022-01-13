package day23_CustomMethods;

public class CustomMethodWithParameters {
    public static void main(String[] args) {

        oddOrEven(15);
    }

    // creat a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" : Even number");
        }else{
            System.out.println(number+" : Odd number");
        }
    }
}

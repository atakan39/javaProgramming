package utilities;

public class MathUtility {

 //--------- Sum of two numbers

    // Sum of two integers
    public static int sum(int num1,int num2){
        return num1+num2;}                      // tested
    // Sum of two decimals
    public static double sum(double num1,double num2) {
        return num1 + num2;}            // tested

    //--------- Substraction of two numbers

    //Substract of two integers
    public static int substract(int num1,int num2){
        int result;
        if(num2<0){
          result=num1+num2;
        }else{
            result=num1-num2;
        }
        return result;}                  // tested
    //Substract of two decimals
    public static double substract(double num1,double num2){
        double result;
        if(num2<0){
            result=num1+num2;
        }else{
            result=num1-num2;
        }
        return result; }         // tested

    //---------Multiplication of two numbers

    // multiplication of two integers
    public static int multiplication(int num1,int num2){
        return num1*num2;}              // tested
    // multiplication of two decimals
    public static double multiplication(double num1,double num2){
        return num1*num2; }     // tested

    //---------division of two decimals
    public static double division(double num1,double num2){
        return num1/num2; }          // tested

    //----Checks even or odd

    // checks if an integer is Even number
    public static boolean isEven(int num1){
        return num1%2==0;
    }         // tested
    //checks if an integer is Odd number
    public static boolean isOdd(int num1){
        return num1%2!=0;
    }           // tested

    //-------- Max Number

    // max of two integers
    public static int max(int num1,int num2){

        if(num1>num2){
            return num1;
        }else{
            return num2;
        }

    }                          // tested
    //max of two decimals
    public static double max(double num1,double num2){

        if(num1>num2){
            return num1;
        }else{
            return num2;
        }

    }                 // tested

    //-------- Min Number

    // min of two integers
    public static int min(int num1,int num2){

        if(num1>num2){
            return num2;
        }else{
            return num1;
        }

    }                          // tested
    // min of two decimals
    public static double min(double num1,double num2){

        if(num1>num2){
            return num2;
        }else{
            return num1;
        }

    }                 // tested

    //------- SquareOf

    //square of integer
    public static int squareOf(int num1){

        return num1*num1;
    }                               // tested
    //square of decimal
    public static double squareOf(double num1){

        return num1*num1;
    }                         // tested

    //-------- CubeOf

    //cube of integer
    public static int cubeOf(int num1){

        return num1*num1*num1;
    }                                   // tested
    //cube of decimal
    public static double cubeOf(double num1){

        return num1 * num1 * num1;
    }                             // tested


}
/*
            2.1 Create a method that can return the sum of two integers
            2.2 Create a method that can return the sum of two decimal numbers

            2.3 Create a method that can return the subtraction of two integers
            2.4 Create a method that can return the subtraction of two decimals

            2.5 Creat a method that can return the multiplication of two integers
            2.6 Create a method that can return the multiplication of two decimals

            2.7 Create a method that passes two double parameters and return the division reslt

            2.8 Create a method that can check if an integer is even number
            2.9 Create a method that can check if an integer is odd number

            2.10 Create a method that can return the maximum number between two integers
            2.11 Create a method that can return the maximum number between two decimal numbers

            2.12 Create a method that can return the minimum number between two integers
            2.13 Create a method that can return the minimum number between two decimal numbers

            2.14 Create a method that can return the square of an integer
                    Ex: square(2) ==> 4
            2.15 Create a method that can return the square of a double

            2.16 Create a method that can return the cube of an integer
            2.17 Create a method that can return the cube of a double
 */
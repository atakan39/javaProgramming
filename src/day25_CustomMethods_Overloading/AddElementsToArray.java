package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int arr1[]={1,2,3,4};
        arr1=addInteger(arr1,9);

        int arr2[]={2,4,6,8,10};
        arr2=addInteger(arr2,20);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------");

        double [] arrd={2.4, 4.5, 4, 5};
        arrd=addDouble(arrd,1.33);

        System.out.println(Arrays.toString(arrd));

        System.out.println("-----------------------------");

        String [] arrS={"atakan","sidar","omer"};
        arrS=addString(arrS,"ozgur");
        System.out.println(Arrays.toString(arrS));

        System.out.println("--------------------------");

        char []arrC={'a','t','a','k','a'};

        arrC=addChar(arrC,'n');
        System.out.println(Arrays.toString(arrC));


    }

    public static int[] addInteger(int []array, int element){
        int [] result=new int[array.length+1];

        int i=0;
        for (int each:array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

    public static double[] addDouble(double[]array,double element){
        double [] result=new double[array.length+1];

        int i=0;
        for (double each:array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

    public static String[] addString(String[]array, String element){
        String [] result=new String[array.length+1];

        int i=0;
        for (String each:array) {
            result[i++]=each;
        }
        result[i]=element;

       return result;
    }

    public static char[] addChar(char[]array, char element){
        char [] result=new char[array.length+1];

        int i=0;
        for (char each:array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }
}

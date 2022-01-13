package day27WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[]={1,1,2,2,3,3};

        arr=removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

    }



    //------------- Remove duplicated elements

    // removes duplicated integers
    public static int[]removeDuplicates(int[]array){
        int[]result={};

        for (int each :array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }
    // removes duplicated double
    public static double[]removeDuplicates(double[]array){
        double[]result={};

        for (double each :array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }
    // removes duplicated char
    public static char[]removeDuplicates(char[]array){
        char[]result={};

        for (char each :array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }
    // removes duplicated String
    public static String[]removeDuplicates(String[]array){
        String[]result={};

        for (String each :array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }
}

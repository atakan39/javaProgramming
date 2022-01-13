package day27WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {

        int arr[]={10, 10, 20, 30, 40, 30, 30, 30};

        arr=replaceAll(arr,30,300);

        System.out.println(Arrays.toString(arr));

    }

    // replaces all the matching old elements of array with new integer element given
    public static int[] replaceAll(int[]array,int oldElement,int newElement){

        for(int i=0; i< array.length; i++){
            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }
    // replaces all the matching old elements of array with new double element given
    public static double[] replaceAll(double[]array,double oldElement,double newElement){

        for(int i=0; i< array.length; i++){
            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }
    // replaces all the matching old elements of array with new String element given
    public static String[] replaceAll(String[]array,String oldElement,String newElement){

        for(int i=0; i< array.length; i++){
            if(array[i].equals(oldElement)){
                array[i]=newElement;
            }
        }
        return array;
    }
    // replaces all the matching old elements of array with new char element given
    public static char[] replaceAll(char[]array,char oldElement,char newElement){

        for(int i=0; i< array.length; i++){
            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }
}

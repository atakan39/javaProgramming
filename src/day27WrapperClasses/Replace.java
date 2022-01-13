package day27WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5};

        arr=replace(arr,2,30);

        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------");

        String []names={"atakan","emre","sidar"};

        names=replace(names,2,"ozgur");

        System.out.println(Arrays.toString(names));


    }
    // replace choosen index element with new int element
    public static  int [] replace(int []array, int index, int newElement){
        if(index<0&&index>array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }
    // replace choosen index element with new double element
    public static  double [] replace(double []array, int index, double newElement){
        if(index<0&&index>array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }
    // replace choosen index element with new String element
    public static  String [] replace(String []array, int index, String newElement){
        if(index<0&&index>array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }
    // replace choosen index element with new char element
    public static  char [] replace(char []array, int index, char newElement){
        if(index<0&&index>array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }
}

package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensoinalArraysIntro {
    public static void main(String[] args) {
        String[] group1={"joe", "joes", "james"};
        String[] group2={"joe", "joes", "james"};
        String[] group3={"joe", "joes", "james"};


        String[][] groups=new String[3][];

        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        // for multi dimensional print

        System.out.println(Arrays.deepToString(groups));

        System.out.println("----------------------------");
        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */

     // index of elements   0 1 2    0 1 2 3      0  1  2  3  4
        int numbers[][]={  {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };
     // index of arrays:       0        1            2


        System.out.println(Arrays.deepToString(numbers));


        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(numbers[2][3]);





    }
}

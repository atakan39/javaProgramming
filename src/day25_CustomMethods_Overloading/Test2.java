package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[]arr1={1,2,3,4,5};

        ArraysUtility.printEach(arr1);

        System.out.println("-----------------------");

        double[]arr2={1.5, 2.5, 3.5,4.5};
        ArraysUtility.printEach(arr2);

        System.out.println("-----------------------");

        char [] arr3={'A','B','C','D'};
        ArraysUtility.printEach(arr3);

        System.out.println("----------------------------");

        String[]arr4={"atakan","emre","sidar"};
        ArraysUtility.printEach(arr4);

        System.out.println("-----------------------------");

        int[]nums={3,5,7};
        System.out.println( ArraysUtility.maxElement(nums));

        System.out.println("----------------------------");

        String names[]={"atakan"};
        String names2[]={"emre"};

        System.out.println(Arrays.toString(ArraysUtility.mergeArray(names,names2)));

        System.out.println("-------------------------");

        String[]students={"atakan","emre"};

        students=ArraysUtility.addElement(students,"sidar");

        System.out.println(Arrays.toString(students));

        System.out.println("--------------------------------");

        int[] a1 = {1,2,3,4,5,4,7};
        boolean r1 = ArraysUtility.contains(a1, 10);
        System.out.println("r1 = " + r1);


        a1=ArraysUtility.removeElement(a1,4);
        System.out.println(Arrays.toString(a1));

        int[]numbers={3,4,4,5,4,5,6,};

        int result=ArraysUtility.frequencyOfElement(numbers,4);
        System.out.println(result);



        String persons[]={"atakan","emre","emre","emre"};

        int resul=ArraysUtility.frequencyOfElement(persons,"emre");
        System.out.println(resul);
        }





    }

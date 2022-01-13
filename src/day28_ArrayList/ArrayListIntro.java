package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>() ;

        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers);
        System.out.println(names);


        numbers.add(5);
        numbers.add(0,4);
        numbers.add(10);


        System.out.println(numbers);

        System.out.println(numbers.get(0));

        // it turns to array list to array;
        int array[]=new int[numbers.size()];
        int i=0;
        for (Integer each:numbers) {
            array[i++]=each;
        }

        System.out.println(Arrays.toString(array));



    }
}

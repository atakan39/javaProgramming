package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[]letters=new char[26];
        /*
        letters[]='A';
        letters[]='B';

         */
        // way 1
        for(char i ='A', j=0; i<='Z' && j< letters.length; i++, j++){
            letters[j]=i;
        }
        // way 2
        for(int i ='A', j=0; i<='Z' && j< letters.length; i++, j++){
            letters[j]=(char)i;
        }
        //way 3 with one variable;
         char ch='A';

        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch;
            ch++;


        }
        System.out.println(Arrays.toString(letters));
    }
}

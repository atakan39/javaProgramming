package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        // creat a variable thats capable enough to contain 5 names

        String myGroup[]=new String[5];
        myGroup[0]="Atakan";
        myGroup[1]="Emre";
        myGroup[2]="omer";
        myGroup[3]="sidar";
        myGroup[4]="ozgur";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------");

        String days[]={"monday","tuesday","wednesday","thirsday","friday","saturday","sunday"};

        System.out.println(Arrays.toString(days));

        int number=12;

        if(!(number>1 || number<7)){
            System.err.println("invalid entry");
            System.exit(0);
        }

        System.out.println(days[number-1]);



    }
}

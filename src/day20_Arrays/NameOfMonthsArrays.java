package day20_Arrays;

import java.util.Scanner;

public class NameOfMonthsArrays {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        while(true){
        System.out.println("Enter number of the month:");
        int number=inPut.nextInt();

        if(!(number>1 && number<12)){
            System.err.println("invalid month entry!");
            System.exit(0);
        }

        String month[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","december"};

        System.out.println(month[number-1]);

        System.out.println("continue??");
        String anotherOne=inPut.next().toLowerCase();

        if(!(anotherOne.equals("no")||anotherOne.equals("yes"))){
            System.out.println("please re enter answer (Yes/no?)");
            anotherOne=inPut.next().toLowerCase();
        }

        if(anotherOne.equals("no")){
            System.out.println("Good Bye");
            break;
        }

}
        inPut.close();
    }
}

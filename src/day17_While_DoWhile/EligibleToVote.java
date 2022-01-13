package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=inPut.nextInt();   // valid age 1~120

        while(!(age>=1 && age<=120)){
            System.err.println("invalid entry, please re-enter");
            System.err.println("enter your age");
            age=inPut.nextInt();
        }

        System.out.println("are you a US citizen? yes/no");
        String answer=inPut.next();

        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("invalid entry, please re-enter");
            System.err.println("are you a US citizen? yes/no");
            answer= inPut.next();
        }

        if(age>=18 && answer.equalsIgnoreCase("yes")){
            System.out.println("you are eligible to vote");
        }else {
            System.out.println("you are not eligible to vote");
        }

        inPut.close();

    }




    }


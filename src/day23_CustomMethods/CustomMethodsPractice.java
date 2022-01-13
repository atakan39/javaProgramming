package day23_CustomMethods;

import java.util.Scanner;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();

        helloCydeo5Times();

        evennumbers();

        print5Times("atakan");

        ageOfPerson(1991);

        eligiblity(2005, "no");

    }

    // Creat a function that can print hello world 5 times ==> helloWorld5Times()

    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
    }

    // creat a function that can print hello Cyddeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    // all the even numbers beetwen 1~10;
    public static void evennumbers(){
        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
// print 5 times any String
    public static void print5Times(String message){
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }

  // creat a function that can display age of the person
  public static void ageOfPerson(int birthYear){

       int age = 2021 - birthYear;
      System.out.println("your age: "+age);

  }
// eligible for vote?
    public static void eligiblity(int birthYear,String usCitizen){
        int age = 2021 - birthYear;
        System.out.println("your age: "+age);

        if(age>=18 && usCitizen.equalsIgnoreCase("yes")){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }
    }

}

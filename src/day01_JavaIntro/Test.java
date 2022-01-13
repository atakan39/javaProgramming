package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;

public class Test {
    public static void main(String[] args) {


        String word= "aaaaaabbbbbbbbbbbbb";

        word=ReturnMethodPractice4.removeDuplicates(word);

        System.out.println(word);


        String name= "Java Programming";

        name=ReturnMethodIntro.reverse(name);

        System.out.println(name);
    }
}

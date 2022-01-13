package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userStr = inPut.nextLine().toLowerCase();

        System.out.println("Enter a word:");
        String word=inPut.next().toLowerCase();



        int wordFreq=0;

        for(int i=0; i <= userStr.length()-word.length(); i++ ){
            if(userStr.substring(i,i+word.length()).equals(word)){
                wordFreq++;
            }

        }
        System.out.println(" "+wordFreq);


    }
}

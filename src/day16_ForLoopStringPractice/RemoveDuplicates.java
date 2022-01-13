package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "aabbaacc";

        String result=""; // abc

        for(int i=(0); i<str.length();i++){
            String ch=""+str.charAt(i); // represents each of the character
// result = ch a, ch a, ch b, ch c,
            if(!result.contains(ch)){
                result+=ch;
            }

            }


        System.out.println(result);


        }

    }


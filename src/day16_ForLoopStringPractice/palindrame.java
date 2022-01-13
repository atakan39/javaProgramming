package day16_ForLoopStringPractice;

public class palindrame {
    public static void main(String[] args) {
        String str="civic";
        String reversed="";

        for(int i = str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        boolean isPalindrom=str.equalsIgnoreCase(reversed);


        System.out.println(isPalindrom);
    }
}

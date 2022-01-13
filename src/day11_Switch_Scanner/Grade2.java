package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch ='A';
        String result="";
        switch (ch){
            // this is the way do or situation in switch byb taking break out ! !
            // until condition end you can do in one line
            case 'A': case 'B': case 'C': case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result="Invalid";
        }
        System.out.println(result);
    }
}

package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,60,70};
    //way 1
        for (int i = 0; i < numbers.length; i++) {
           int eachElement = numbers[i];
            System.out.print(eachElement+" ");
        }
        System.out.println(" ");
    // way 2 for each loop   Faster

        for (int each: numbers) {
            System.out.print(each+" ");
        }


    }
}

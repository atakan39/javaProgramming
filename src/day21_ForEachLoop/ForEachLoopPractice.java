package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[]words={"Java Programing","Cydeo School","Wooden Spoon","early Birds","Angry Birds"};

        for(String element:words){
            System.out.println(""+element.charAt(0)+element.charAt(element.length()-1));
        }
    }
}

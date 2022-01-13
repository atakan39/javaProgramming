package day24_CustomMethods_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfDay(5);

    }



    public static void nameOfDay(int number){
        if(number<1||number>7){
            System.err.println("invalid");
            return; // exits nameOfDay method
        }

        String day=(number==1)?"monday":(number==2)?"tuesday":(number==3)?"Wednesday":(number==4)?"thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday";
        System.out.println(day);
    }



}

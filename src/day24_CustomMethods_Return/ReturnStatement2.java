package day24_CustomMethods_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {

           nameOfMonth(7);

    }

    public static void nameOfMonth(int number){  // 95

         

        if(number < 1 || number > 12) {   // we can use return to exit the method instead of using nested loop
            System.out.println("invalid");
            return;
        }

        String name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        System.out.println("Month name = " + name);
        }

    }



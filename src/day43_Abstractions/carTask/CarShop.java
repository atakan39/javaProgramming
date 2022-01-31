package day43_Abstractions.carTask;

public class CarShop {
    public static void main(String[] args) {

      //  Car car1=new Car("Cydeo","Batch25","Blue",2022,100000);

        Audi audi1=new Audi("Q7","Blue",2020,45000);

        Honda honda1=new Honda("Accord","Black",2019,30000);

        Tesla tesla1=new Tesla("Model13","White",2021,60000);

        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla1);

        System.out.println("______---------------___________");

        honda1.setColor("red");
        audi1.setColor("pink");
        tesla1.setColor("Green");

        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla1);



    }
}

package day38_Inheritance.carTask;

public class Bmw extends Car{
    public Bmw( String model, int year, int miles, String color) {
        super("bmw", model, year, miles, color);
    }

    public void breaksDown(){
        System.out.println(brand+model+" is breakingDown");
    }
    public void racing(){
        System.out.println(brand+model+" is racing");
    }

}

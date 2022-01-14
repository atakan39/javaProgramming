package day38_Inheritance.carTask;

public class Bmw extends Car{
    public Bmw( String model, int year, int miles, String color,double price) {
        super("bmw", model, year, miles, color,price);
    }

    public void breaksDown(){
        System.out.println(brand+model+" is breakingDown");
    }
    public void racing(){
        System.out.println(brand+model+" is racing");
    }

    public void start(){
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }

}

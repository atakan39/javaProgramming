package day43_Abstractions.carTask;

public class Audi extends Car{
    public Audi(String model,String color, int year,  double price) {
        super("audi", model, color,year, price);
    }

    @Override
    public void start() {
        System.out.println("CCCC");
    }
}

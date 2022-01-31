package day43_Abstractions.carTask;

public class Audi extends Car{
    public Audi(String model, int year, String color, double price) {
        super("audi", model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println("CCCC");
    }
}

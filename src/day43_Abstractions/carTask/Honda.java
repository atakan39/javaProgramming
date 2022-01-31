package day43_Abstractions.carTask;

public class Honda extends Car{
    public Honda( String model, int year, String color, double price) {
        super("honda", model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println("AAAA");
    }
}

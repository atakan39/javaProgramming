package day43_Abstractions.carTask;

public class Honda extends Car{
    public Honda( String model,String color, int year,  double price) {
        super("honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("AAAA");
    }
}

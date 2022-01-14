package day38_Inheritance.carTask;

public class Car {
    public String brand,model;
    public int year,miles;
    public String color;
    public double price;

    public Car(String brand, String model, int year, int miles, String color,double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.miles = miles;
        this.color = color;
        this.price=price;
    }

    public void start(){
        System.out.println(brand+" "+model+" is started");
    }

    public void drive(){
        System.out.println(brand+" "+model+" is driven since "+year);
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
 instance methods:
            start(), drive(),toString()

    Create the following sub classes of Car:
        1. Toyota:
                extra methods:
                    reliable()

        2. BMW:
                extra methods:
                    breaksDown()
                    racing()

        3. Tesla:
                extra methods:
                    autoPilot();
 */
package day43_Abstractions.shapeTask;

public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {


        if(name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }


    public Shape(String name) {
        setName(name);
    }


    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

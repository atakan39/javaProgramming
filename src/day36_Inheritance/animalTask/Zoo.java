package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setInfo("max","Husky",'M',"small",2,"Gray");

        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        dog1.bark();
        // dog.hunt();
        // dog.scratch();

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',"small",3,"brown");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();

        cat.meow();  // own by cat

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', "large", 4, "Red");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();

        tiger.roar();  //  own by tiger
        tiger.hunt();  // own by tiger










    }

}

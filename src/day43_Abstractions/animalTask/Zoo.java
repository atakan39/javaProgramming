package day43_Abstractions.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Siberian", 'M', "Large", 5, "Black and Orange");

        Eagle eagle = new Eagle("American Eagle",'M', "Big", 3, "Brown");

        Dog dog = new Dog("Husky", 'M', "Large",3, "Black and White");

        Eagle eagle2 = new Eagle("Golden" , 'M',"Large",7, "White and brown");

        Cat cat = new Cat("Siamase",'F', "Medium", 3, "White");

        Human human=new Human("atakan","Turkish",'M',"tall",30,"Turkish color");

        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println(eagle2);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(human);

        System.out.println("human name = "+human.getName());
        System.out.println("name = " + tiger.getName() +", breed = "+ tiger.getBreed());


        tiger.eat();
        eagle.eat();
        dog.eat();
        eagle2.eat();
        cat.eat();
        human.eat();

        tiger.hunt();
        eagle.fly();
        cat.scratch();
        human.speak();
        dog.bark();

        human.drink();
        tiger.drink();
        dog.drink();

        human.sleep();
        tiger.sleep();
        dog.sleep();

        dog.getBreed();
        cat.getBreed();








    }
}

package src.miscellaneous;

public class AnimalImplementation {


    public static void main(String[] args) {

        Animal animal = new Animal(4, 2, 2, 35.5);

        animal.walk();
        animal.talk();
        System.out.println(animal.sayHello());

        System.out.println("The number of legs are: " + animal.numberOfLegs);
        System.out.println("The number of eyes are: " + animal.numberOfEyes);
        System.out.println("The number of ears are: " + animal.numberOfEars);


    }

}

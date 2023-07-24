package src.miscellaneous;

//Every file can have only one public class
//The name of that class should be the same as that of file.
public class Animal {

 int numberOfLegs;
 int numberOfEyes;
 int numberOfEars;
 double weightInKilograms;


 //parameterized constructors.
  public Animal(int legs, int eyes, int ears, double weight) {
    this.numberOfLegs = legs;
    this.numberOfEars = ears;
    this.numberOfEyes = eyes;
    this.weightInKilograms = weight;
 }

 public void walk() {
    System.out.println("I can walk");
 }

 public void talk() {
    System.out.println("I can talk");
 }

 public String sayHello() {
    return "Hello, I am the animal!!!";
 }
}

package src.generics;

public class Car {

    String modelNumber;
    String modelName;
    String type;

    public Car(String modelNumber, String modelName, String type) {
        this.modelNumber = modelNumber;
        this.modelName = modelName;
        this.type = type;
    }
    
    public <T, V> T returnRegisteredModel(T chassis, V uniqueIntegerValue) {
        System.out.println(uniqueIntegerValue);
        return chassis;
    }

    public AnimalPark<? extends Animal> getAnimalInsideCarPark() {
        //Finds which animal is in the car and returns that animal;
        return new AnimalPark<>(new Dog());
    } 
}

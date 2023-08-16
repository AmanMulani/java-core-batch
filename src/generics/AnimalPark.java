package src.generics;

public class AnimalPark<T extends Animal> {
    
    T animal;

    AnimalPark(T animal) {
        this.animal = animal;
    }

    public void introduceYourself() {
        animal.introduce();
    }
}

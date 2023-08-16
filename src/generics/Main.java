package src.generics;

public class Main {
    
    public static void main(String[] args) {

        FirstGenericExample<String> firstGenericExample1 = new FirstGenericExample<String>("From string");
        FirstGenericExample<Integer> firstGenericExample2 = new FirstGenericExample<Integer>(0);
        System.out.println(firstGenericExample1.returnFirstElement());
        System.out.println(firstGenericExample2.returnFirstElement());

        SecondGenericExample<String, Integer> secondGenericExample = new SecondGenericExample<>();
        secondGenericExample.phoneNumbers.add("+911231413413");
        secondGenericExample.grades.add(10);

        Car car = new Car("XSJB-9981", "Travis", "Premium-SUV");
        car.returnRegisteredModel("1234u3ufd", 234);
    }
}

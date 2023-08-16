package src.generics;

import java.util.ArrayList;
import java.util.List;

public class SecondGenericExample<T, V> {
    
    final List<T> phoneNumbers;
    final List<V> grades;

    public SecondGenericExample() {
        phoneNumbers = new ArrayList<>();
        grades = new ArrayList<>();
    }  
}

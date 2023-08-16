package src.generics;

import java.util.ArrayList;
import java.util.List;

//A generic class.
//It initializes a generic list of ids.
public class FirstGenericExample<T> {
    
    final private List<T> ids;

    public FirstGenericExample(T firstElem) {
        this.ids =  new ArrayList<>();
        ids.add(0, firstElem);
    }

    public T returnFirstElement() {
        return ids.get(0);
    }
}

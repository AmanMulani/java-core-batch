package src.lruCache;

import java.util.*;

public class MostSimpleCache {

    public static void main(String args[]) {
        Map<Integer, Integer> cache = new HashMap<>();
        getElement(1, cache);//1 => 10
        getElement(1, cache);
        getElement(1, cache);
        // System.out.println(timeConsumingMethod(1));
        // System.out.println(timeConsumingMethod(1));
        // System.out.println(timeConsumingMethod(1));
    }

    public static void getElement(int i, Map<Integer, Integer> cache) {
        if(cache.containsKey(i)) {
            System.out.println(cache.get(i));
        } else {
            int ans = timeConsumingMethod(i);
            cache.put(i, ans);
            System.out.println(ans);
        }
    }

    public static int timeConsumingMethod(int i) {
        try {
            System.out.println("I am starting the heavy work");
            Thread.sleep(5000);
            System.out.println("I am ending the heavy work");
            return i * 10;
        } catch (Exception e) {
            System.out.println(e.toString());
            return -1;
        }
    }
//1, 1, 1
}
package src.lruCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import src.lruCache.execptions.NotFoundException;
import src.lruCache.interfaces.Cache;

public class LinkedListHashMapCache<K, V> implements Cache<K, V>{

    public final int SIZE;
    private List<KeyValuePair<K, V>> elements;
    private Map<K, KeyValuePair<K, V>> cache;

    LinkedListHashMapCache(int size) {
        this.SIZE = size;
        elements = new LinkedList<>();
        cache = new HashMap<>();
    }

    @Override
    public V get(K key) throws NotFoundException {
        if(cache.containsKey(key)) {
            return cache.get(key).value;
        }
        throw new NotFoundException("HIGH", "The element that you were looking for does not exists.", "500");
    }

    @Override
    public void put(K key, V value) {
        if(elements.size() == SIZE) {
            KeyValuePair<K, V> removedElement = cache.remove(0);
            cache.remove(removedElement.key);
        } 

        KeyValuePair<K, V> keyValuePair = new KeyValuePair<K, V>(key, value);
        elements.add(keyValuePair);
        cache.put(key, keyValuePair);
    }
    
}

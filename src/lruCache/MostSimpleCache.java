package src.lruCache;

import java.util.*;

import src.lruCache.execptions.NotFoundException;
import src.lruCache.interfaces.Cache;

public class MostSimpleCache<K, V> implements Cache<K, V> {

    Map<K, V> cache;

    public MostSimpleCache() {
        this.cache = new HashMap<>();
    }

    @Override
    public V get(K key) throws NotFoundException{
        return cache.get(key);
    }

    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }
}
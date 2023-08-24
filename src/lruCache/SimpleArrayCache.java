package src.lruCache;

public class SimpleArrayCache {
    
    public final Integer size;
    final KeyValuePair[] cache;
    private int count;

    SimpleArrayCache(int size) {
        this.size = size;
        cache = new KeyValuePair[size];
        this.count = 0;
    }


    public String get(String key) {
        for(int i = 0; i<count; i++) {
            if(cache[i].key.equals(key)) {
                return cache[i].value;
            }
        }
        return null;
    }


    public void put(String key, String value) {
        if(count == size) {
            //Left shift operation
            for(int i = 1; i<size-1; i++) {
                cache[i-1] = cache[i];
            }
            cache[size-1] = new KeyValuePair(key, value);
        } else {
            cache[count] = new KeyValuePair(key, value);
        }
    }

    
}

class KeyValuePair {
    public String key;
    public String value;

    public KeyValuePair(String k, String v) {
        this.key = k;
        this.value = v;
    }

}

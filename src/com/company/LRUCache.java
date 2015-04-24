package com.company;

import java.util.*;

/**
 * Created by jjhu on 2015/4/9.
 */
public class LRUCache{
    private Map<Integer, Integer> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<Integer, Integer>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public int get(int key) {
        if (this.map.containsKey(key)){
            int tmp = this.map.get(key);
            this.map.remove(key);
            this.map.put(key, tmp);
            return tmp;
        }
        return -1;
    }

    public void set(int key, int value) {
        if (this.map.containsKey(key)){
            this.map.put(key, value);
            return;
        }
        this.map.put(key, value);
    }
}

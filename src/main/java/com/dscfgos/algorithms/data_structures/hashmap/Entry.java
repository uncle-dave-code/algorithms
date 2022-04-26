package com.dscfgos.algorithms.data_structures.hashmap;

public class Entry<K ,V> {

    private final K key;
    private V value;
    private Entry<K ,V> next;
    private int hash;

    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

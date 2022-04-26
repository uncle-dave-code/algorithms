package com.dscfgos.algorithms.data_structures.hashmap;

public class HashMap<K, V> {

    private int capacity = 16;
    private float loadFactor = 0.75F;

    private Entry<K, V>[] buckets;

    public V put(K key, V value) {
        return null;
    }

    public V get(K key) {
        return null;
    }

    private int getHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }

    public int resize() {
        int newCapacity = capacity << 2;
        Entry[] newTable = new Entry[newCapacity];
        System.arraycopy(buckets, 0, newTable, 0, buckets.length);
        this.buckets = newTable;
        return newCapacity;
    }

    public final int hash(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode());
    }

}

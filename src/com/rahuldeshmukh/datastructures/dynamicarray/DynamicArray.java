/**
 * @author rahul deshmukh, emailnot4bots@gmail.com
 */
package com.rahuldeshmukh.datastructures.dynamicarray;

import java.util.Iterator;

@SuppressWarnings("unchecked")

public class DynamicArray<T> implements Iterable<T> {
    private T[] arr;
    private int len = 0; //length user thinks the array is
    private int capacity = 0;   //actual array size

    public DynamicArray(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("capacity can't be less than 1, you 've selected: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(int index, T element) {
        arr[index] = element;
    }

    public void clear() {
        for (int i = 0; i < len; i++) arr[i] = null;
        len = 0;
    }


    @Override

    public Iterator<T> iterator() {
        return null;
    }
}

package com.aryan.OOPs.Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private int size = 0; // also working as index value

    public CustomGenericArrayList() {
        int DEFAULT_SIZE = 10;
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        // Syntax: System.arraycopy(sourceArray, startIndexInSource, destinationArray,
        // startIndexInDestination, numberOfElementsToCopy);
        // System.arraycopy(data, 0, temp, 0, temp.length);
        data = temp;
    }

    public void remove() {
//        T removed = (T)(data[--size]);
//        return removed;
        --size;
    }

    public T get(int index) {
        return (T) (data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

//        CustomGenericArrayList list = new CustomGenericArrayList();
//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//        System.out.println(list);

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
        list.remove(); // see the size after using remove()
        System.out.println(list);
    }
}

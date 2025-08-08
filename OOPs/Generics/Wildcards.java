package com.aryan.OOPs.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// here is the example of wildcard
// here T should either be Number or its subclasses
public class Wildcards<T extends Number> {

    private Object[] data;
    private int size = 0; // also working as index value

    public Wildcards() {
        int DEFAULT_SIZE = 10;
        this.data = new Object[DEFAULT_SIZE];
    }

    // this is a wildcard
    public void getList(List<? extends Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.print(list.getLast());
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
        return (T)(data[index]);
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

        Wildcards<Integer> list = new Wildcards<>();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
        list.remove(); // see the size after using remove()
        System.out.println(list);

        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.getList(l);
    }
}

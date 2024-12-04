package org.example.genericExample;

public class GenericArray<T> {
    T[] values =(T[]) new Object[10];
    int length = 0;
    public void append(T value) {
        values[length++] = value;
    }
    public void print() {
        for (int i=0; i<length; i++) {
            System.out.println(values[i]);
        }
    }

}

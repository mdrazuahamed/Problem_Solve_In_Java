package org.example;

public class GenericArrayForAbstract<T extends InterfaceForGeneric> {
    T array[] = (T[]) new Object[10];
    int length = 0;
    public void append(T v) {
        array[length++] = v;
    }
    public void display() {
        for (int i=0; i<length; i++) {
            System.out.println(array[i]);
        }
    }
}

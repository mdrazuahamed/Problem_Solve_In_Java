package org.example;

import org.example.lambdaExample.MyLambda;

public class AnnonomusInnerClass {
    public static void main(String[] args) {
        MyLambda demo = new MyLambda() {
            @Override
            public void display() {
                System.out.println("Inside Annonomus class");
            }
        };
    }
}
